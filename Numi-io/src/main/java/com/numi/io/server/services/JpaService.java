package com.numi.io.server.services;

import com.google.common.collect.Lists;
import com.numi.io.common.json.Body;
import com.numi.io.common.json.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Service
public class JpaService {

    private static final Logger logger = LoggerFactory.getLogger(JpaService.class);

    @PersistenceContext
    EntityManager entityManager;


    @Transactional(rollbackOn = {Exception.class})
    public void insertDb(List<Object> tableEntityList) throws Exception {

        for (Object o : tableEntityList) {
            entityManager.persist(o);
        }
    }

    @Transactional(rollbackOn = {Exception.class})
    public void updateInsertDb(List<Object> tableEntityList, Root json) throws Exception {

        for (Object newObj : tableEntityList) {

            Class<?> clazz = newObj.getClass();

            String[] sp = clazz.getName().split("\\.");
            String tableName = sp[sp.length - 1];
            StringBuffer sql = new StringBuffer();
            sql.append("from " + tableName + " where 1 = 1 ");

            //循环查找where条件
            List<Body> bodies = json.getBody();

            ArrayList<String> vals = Lists.newArrayList();
            int j = 1;
            for (Body body : bodies) {
                if (body.isCondition()) {
                    String columnName = body.getTableField();
                    //从object获取这个column的值
                    char[] chars = firstCapitalization(columnName);
                    Method method = clazz.getMethod("get".concat(new String(chars)));
                    String value = (String) method.invoke(newObj);
                    sql.append(" and " + columnName + " = ?" + j);
                    vals.add(value);
                    j++;
                }
            }

            logger.info("sql={}", sql.toString());
            Query query = entityManager.createQuery(sql.toString());
            for (int i = 0; i < vals.size(); i++) {
                query.setParameter(i + 1, vals.get(i));
            }

            List<Object> resultList = query.getResultList();
            if (resultList != null && resultList.size() > 0) {
                Object oldObj = resultList.get(0);
                Class<?> oldClass = oldObj.getClass();
                Method getId = oldClass.getMethod("getId");
                Integer id = (Integer)getId.invoke(oldObj);
                Method setId = clazz.getMethod("setId", Integer.class);
                setId.invoke(newObj, id);
            }
            entityManager.merge(newObj);

        }
        entityManager.flush();
    }

    private char[] firstCapitalization(String str) {

        char[] fied = str.toCharArray();

        if (fied[0] >= 'a' && fied[0] <= 'z') {

            fied[0] = (char) (fied[0] - 32);

        }

        return fied;
    }
}
