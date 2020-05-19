package com.unitslink.nacoscope.customer.controller;

import com.unitslink.nacoscope.customer.service.OrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * OrderController
 *
 * @author L.X <gugia@qq.com>
 */
@RefreshScope
@RestController
public class OrderController {

    @Resource
    private LoadBalancerClient loadBalancerClient;
    @Resource
    private OrderService orderService;

    @Value("${shop-name}")
    private String shopName;

    @GetMapping("/ask/{user}")
    public String hello(@PathVariable String user) {
        ServiceInstance serviceInstance = loadBalancerClient.choose("waitress");
        String url = serviceInstance.getUri() + "/hello/" + user;
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        return "Invoke : " + url + ", shop name is " + shopName + ", return : " + result;
    }

    @GetMapping("/askJohn")
    public String hello() {
        return orderService.askJohn();
    }
}
