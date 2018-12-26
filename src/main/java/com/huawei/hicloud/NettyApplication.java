package com.huawei.hicloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class NettyApplication {

    public static final Logger logger = LoggerFactory.getLogger(NettyApplication.class);

    public static void main(String[] args) {
        logger.info("Netty application start ...");
        SpringApplication.run(NettyApplication.class, args);
    }

}
