package com.unitslink.nacoscope.customer;

import com.alibaba.csp.sentinel.datasource.ReadableDataSource;
import com.alibaba.csp.sentinel.datasource.nacos.NacosDataSource;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.List;

/**
 * Customer主程序入口
 *
 * @author L.X <gugia@qq.com>
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CustomerApp {

    public static void main(String[] args) {
        ReadableDataSource<String, List<FlowRule>> flowRuleDataSource = new NacosDataSource<>("localhost:8848", "DEFAULT_GROUP", "customer-sentinel",
                source -> JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
                }));
        FlowRuleManager.register2Property(flowRuleDataSource.getProperty());
        SpringApplication.run(CustomerApp.class, args);
    }
}
