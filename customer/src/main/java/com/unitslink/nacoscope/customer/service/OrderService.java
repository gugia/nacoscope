package com.unitslink.nacoscope.customer.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * OrderService
 *
 * @author L.X <gugia@qq.com>
 */
@Service
public class OrderService {

    @SentinelResource(value = "askJohn")
    public String askJohn() {
        return "Hello, John";
    }
}
