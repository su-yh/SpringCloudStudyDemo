package com.suyh.eurekacenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @EnableEurekaServer 这个注释就是指定该服务是一个EurekaServer 服务。
 *                      如果不加这个注释，那这个工程就是一个标准的SpringBoot 服务
 *  这个SpringBoot 的启动(入口)类，它被配置在 pom.xml 文件中
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCenterApplication.class, args);
    }

}
