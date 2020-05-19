package com.unitslink.nacoscope.customer.bootstrap;

import com.alibaba.csp.sentinel.datasource.ReadableDataSource;
import com.alibaba.csp.sentinel.datasource.nacos.NacosDataSource;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

/**
 * Bootstrap
 *
 * @author L.X <gugia@qq.com>
 */
public class Bootstrap implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
//        ReadableDataSource<String, List<FlowRule>> flowRuleDataSource = new NacosDataSource<>("localhost:8848", "DEFAULT_GROUP", "customer-sentinel",
//                source -> JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
//                }));
//        FlowRuleManager.register2Property(flowRuleDataSource.getProperty());
    }
}
