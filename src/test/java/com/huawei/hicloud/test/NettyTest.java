package com.huawei.hicloud.test;

import com.huawei.hicloud.netty.client.EchoClient;
import com.huawei.hicloud.netty.server.EchoServer;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NettyTest {

    private static final Logger logger = LoggerFactory.getLogger(NettyTest.class);

    @Test
    public void testNettyServer() throws Exception {

        int port = 8085;

        logger.info("Netty server start, port: {}.", port);
        EchoServer echoServer = new EchoServer(port);
        echoServer.run();

        logger.info("Netty server close.");

    }

    @Test
    public void testNettyClient() throws Exception {

        String host = "127.0.0.1";
        int port = 8085;

        logger.info("Netty client start, host: {}, port: {}.", host, port);
        EchoClient echoClient = new EchoClient(host, port);
        echoClient.run();

        logger.info("Netty client close.");
    }

}
