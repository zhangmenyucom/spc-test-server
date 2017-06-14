package com.taylor.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author xiaolu.zhang
 * @desc:
 * @date: 2017/6/14 16:09
 */
@SpringBootApplication
@EnableConfigServer
public class ServerStarter {
    public static void main(String... args) {
        SpringApplication.run(ServerStarter.class, args);
    }
}
