package com.numi.io.server.interceptor;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.io.CacheAndWriteOutputStream;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.hibernate.annotations.common.util.StringHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.util.Locale;


public class LogOutInterceptor extends AbstractPhaseInterceptor<Message> {

    private static final Logger logger = LoggerFactory.getLogger(LogOutInterceptor.class);

    private static final Logger _log = LoggerFactory.getLogger(LogOutInterceptor.class);

    public LogOutInterceptor() {
        //拦截器在调用方法之前拦截SOAP消息
        super(Phase.PRE_STREAM);
    }

    /**
     * @Description: 拦截器操作
     * @param message 被拦截到的SOAP消息
     * @throws Fault
     */
    @Override
    public void handleMessage(Message message) {

        OutputStream os = (OutputStream)message.getContent(OutputStream.class);
        final CacheAndWriteOutputStream newOut = new CacheAndWriteOutputStream(os);
        message.setContent(OutputStream.class, newOut);
        message.getInterceptorChain().doIntercept(message);

        CachedOutputStream csnew = (CachedOutputStream) message.getContent(OutputStream.class);
        InputStream in = null;
        try {
            in = csnew.getInputStream();
            String xml = IOUtils.toString(in);


            if (!StringHelper.isEmpty(xml)) {
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                InputSource is = new InputSource(new StringReader(xml));

                Document document = db.parse(is);

//                document.getDocumentElement().removeChild(document.getDocumentElement().getFirstChild());

                OutputFormat format = new OutputFormat(document);
                format.setLineWidth(65);
                format.setIndenting(true);
                format.setIndent(2);
                Writer out = new StringWriter();
                XMLSerializer serializer = new XMLSerializer(out, format);
                serializer.serialize(document);


                logger.info("应答电文:{}",out.toString());
            }
        } catch (Exception e) {
            logger.error("发生系统异常",e);
            throw new Fault(e);
        }

    }

}
