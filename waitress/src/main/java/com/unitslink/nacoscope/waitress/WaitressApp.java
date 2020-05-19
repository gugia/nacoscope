package com.unitslink.nacoscope.waitress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Waitress主程序入口
 *
 * @author L.X <gugia@qq.com>
 */
@EnableDiscoveryClient
@SpringBootApplication
public class WaitressApp {

    public static void main(String[] args) {
        SpringApplication.run(WaitressApp.class, args);
    }
}
