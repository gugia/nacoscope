package com.unitslink.nacoscope.producer.service;

import com.unitslink.nacoscope.common.ProducingService;
import org.apache.dubbo.config.annotation.Service;

/**
 * ProducingServiceImpl
 *
 * @author L.X <gugia@qq.com>
 */
@Service
public class ProducingServiceImpl implements ProducingService {

    @Override
    public String produce(String stuff) {
        return "producer produced " + stuff;
    }
}
