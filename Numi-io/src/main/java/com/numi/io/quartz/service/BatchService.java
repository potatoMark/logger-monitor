package com.numi.io.quartz.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Iterator;

@Service
public class BatchService<T> {

    @PersistenceContext
    EntityManager entityManager;

    @Value("${batchSize}")
    private int batchSize;


    @Transactional
    public <S extends T> Iterable<S> batchSave(Iterable<S> var1) {
        Iterator<S> iterator = var1.iterator();
        int index = 0;
        while (iterator.hasNext()){
            entityManager.persist(iterator.next());
            index++;
            if (index % batchSize == 0){
                entityManager.flush();
                entityManager.clear();
            }
        }
        if (index % batchSize != 0){
            entityManager.flush();
            entityManager.clear();
        }
        return var1;
    }

    @Transactional
    public <S extends T> Iterable<S> batchUpdate(Iterable<S> var1) {
        Iterator<S> iterator = var1.iterator();
        int index = 0;
        while (iterator.hasNext()){
            entityManager.merge(iterator.next());
            index++;
            if (index % batchSize == 0){
                entityManager.flush();
                entityManager.clear();
            }
        }
        if (index % batchSize != 0){
            entityManager.flush();
            entityManager.clear();
        }
        return var1;
    }

}
