package com.fujitsu.job;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Map;

public class MesToAdapterJob extends Thread {

    private static final Logger logger = LoggerFactory.getLogger(MesToAdapterJob.class);

    private Socket _socket;

    private OutputStream _os;

    private InputStream _is;

    private Socket _cbopSocket;

    private OutputStream _cbopOs;

    private InputStream _cbopIs;

    private int _recv;

    private byte[] sendSocketByte = new byte[12];

    private Map<String, String> _printRelation;

    public MesToAdapterJob(Socket socket, Map<String, String> map) {

        this._socket = socket;

        this._printRelation = map;
    }

    @Override
    public void run() {

        try {
            byte[] buf = new byte[99999];


            _socket.setKeepAlive(true);

            _socket.setSoTimeout(5 * 1000);

            _os = _socket.getOutputStream();

            _is = _socket.getInputStream();

            logger.info("开始接收电文,IP:{}", _socket.getInetAddress().getHostAddress());

            _recv = _is.read(buf);

            if (_recv == -1) {

                logger.info("远程主动断开连接,IP:{}", _socket.getInetAddress().getHostAddress());
                return;
            }

            String recvMsg = new String(buf, 0, _recv, "UTF-8");

            logger.info("收到电文内容:{},IP:{}", recvMsg, _socket.getInetAddress().getHostAddress());

            byte[] sndPrtNameBytes = subBytes(buf, 0, 10);

            String prtName = new String(sndPrtNameBytes, "UTF-8").trim();


            String cbopIp = _printRelation.get(prtName);
            if (StringUtils.isEmpty(cbopIp)) {

                sendSocketByte = ArrayUtils.addAll(sndPrtNameBytes,"EX".getBytes("UTF-8"));
                _os.write(sendSocketByte);

                logger.error("当前打印机未配置远程CBOP的IP,打印机名称:{}", prtName);
                return;
            }

            //发送数据到CBOP
            _cbopSocket = new Socket();
            SocketAddress socketAddress = new InetSocketAddress(cbopIp, 8001);
            _cbopSocket.connect(socketAddress, 5 * 1000);
            _cbopSocket.setSoTimeout(10 * 1000);

            _cbopOs = _cbopSocket.getOutputStream();

            _cbopIs = _cbopSocket.getInputStream();

            _cbopOs.write(buf);
            _cbopOs.flush();
            byte[] cbopbuf = new byte[9999];
            int re = _cbopIs.read(cbopbuf);

            if (re == -1) {
                logger.error("CBOP主动断开连接,IP:{}", cbopIp);
                return;
            }

            String msg = new String(cbopbuf, 0, re, "UTF-8");

            logger.info("收到电文CBOP应答电文:{}",msg);

            _os.write(cbopbuf);

        } catch (Exception e) {
            logger.error("发生系统异常", e);

        } finally {


            try {
                if (_socket != null) {
                    _socket.close();
                }
                if (_os != null) {
                    _os.close();
                }
                if (_is != null) {
                    _is.close();
                }

                if (_cbopSocket != null) {
                    _cbopSocket.close();
                }
                if (_cbopOs != null) {
                    _cbopOs.close();
                }
                if (_cbopIs != null) {
                    _cbopIs.close();
                }
            } catch (Exception exx) {
                logger.error("close socket error", exx);
            }

        }

    }


    private byte[] subBytes(byte[] b, int start, int len) {

        byte[] bs = new byte[len];

        int end = start + len;


        for (int i = 0; start < end; start++, i++) {
            bs[i] = b[start];
        }
        return bs;

    }
}
