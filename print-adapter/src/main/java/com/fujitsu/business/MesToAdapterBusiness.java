package com.fujitsu.business;

import com.fujitsu.configration.PrintRelation;
import com.fujitsu.job.MesToAdapterJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Component
public class MesToAdapterBusiness {

    private static final Logger logger = LoggerFactory.getLogger(MesToAdapterBusiness.class);

    private static ServerSocket _serverSocket;

    private static Socket _socket;

    private static ExecutorService _threadSpool = new ThreadPoolExecutor(20, 20,
            0L, TimeUnit.MILLISECONDS, // 参数的时间单位
            new LinkedBlockingQueue<Runnable>(), // 执行前用于保持任务的队列。此队列仅保持由
            new ThreadPoolExecutor.CallerRunsPolicy() // 由于超出线程范围和队列容量而使执行被阻塞时所使用的处理程序
    );

    @Value("${adapter.port}")
    private int port;

    @Autowired
    PrintRelation printRelation;

    public void start(String ...agrs){

        logger.info("开始创建socket");
        try {
            _serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            logger.error("发生系统异常,有可能是端口被占用",e);
            return;
        }

        while(true){

            try {
                //创建accept
                logger.info("Socket服务创建成功");
                _socket = _serverSocket.accept();

                logger.info("IP:{},成功连接到服务器",_socket.getInetAddress().getHostAddress());
                if (!_threadSpool.isShutdown()) {

                    MesToAdapterJob job = new MesToAdapterJob(_socket,printRelation.getCbop());

                    // 设置为守护线程
                    job.setDaemon(true);

                    _threadSpool.execute(job);
                }
            } catch (IOException e) {
                logger.error("适配器在等待MES握手时发生系统异常",e);
                return;
            }

        }
    }
}
