package com.unitslink.nacoscope.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ProducerApp
 *
 * @author L.X <gugia@qq.com>
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProducerApp {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApp.class, args);
    }
}
