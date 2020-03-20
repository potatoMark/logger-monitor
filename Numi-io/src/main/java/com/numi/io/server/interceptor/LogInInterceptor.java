package com.numi.io.server.interceptor;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.transport.http.AbstractHTTPDestination;
import org.hibernate.annotations.common.util.StringHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

public class LogInInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

    private static final Logger logger = LoggerFactory.getLogger(LogInInterceptor.class);

    public LogInInterceptor() {
        //拦截器在调用方法之前拦截SOAP消息
        super(Phase.RECEIVE);
    }

    /**
     * @Description: 拦截器操作
     * @param message 被拦截到的SOAP消息
     * @throws Fault
     */
    @Override
    public void handleMessage(SoapMessage message) throws Fault {

        String soapMessage = null;

        HttpServletRequest httpRequest = (HttpServletRequest) message.get(AbstractHTTPDestination.HTTP_REQUEST);
        if (httpRequest != null) {

            InputStream ist = message.getContent(InputStream.class);
            if (ist != null) {
                CachedOutputStream bos = new CachedOutputStream();
                try {
                    IOUtils.copy(ist, bos);

                    bos.flush();
                    ist.close();
                    message.setContent(InputStream.class, bos.getInputStream());
                    soapMessage = new String(bos.getBytes());//this soap message is what you want
                    bos.close();

                    if (!StringHelper.isEmpty(soapMessage)) {
                        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                        DocumentBuilder db = dbf.newDocumentBuilder();
                        InputSource is = new InputSource(new StringReader(soapMessage));

                        Document document = db.parse(is);

                        document.getDocumentElement().removeChild(document.getDocumentElement().getFirstChild());

                        OutputFormat format = new OutputFormat(document);
                        format.setLineWidth(65);
                        format.setIndenting(true);
                        format.setIndent(2);
                        Writer out = new StringWriter();
                        XMLSerializer serializer = new XMLSerializer(out, format);
                        serializer.serialize(document);

                        logger.info("收到电文:{}",out.toString());

                    }


                } catch (Exception e) {
                    logger.error("发生系统异常",e);
                    throw new Fault(e);
                }
            }

        }
    }

}
