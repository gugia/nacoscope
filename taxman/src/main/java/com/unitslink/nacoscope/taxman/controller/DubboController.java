package com.unitslink.nacoscope.taxman.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.unitslink.nacoscope.common.ProducingService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Dubbo Controller
 *
 * @author L.X <gugia@qq.com>
 */
@RestController
public class DubboController {

    @Reference
    private ProducingService producingService;

    @SentinelResource(value = "produce")
    @GetMapping("/produce")
    public String produce(@RequestParam String stuff) {
        return producingService.produce(stuff);
    }
}
