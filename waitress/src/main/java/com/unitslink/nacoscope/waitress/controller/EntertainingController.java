package com.unitslink.nacoscope.waitress.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * EntertainingController
 *
 * @author L.X <gugia@qq.com>
 */
@RestController
public class EntertainingController {

    @GetMapping("/hello/{user}")
    public String hello(@PathVariable String user) {
        return "hello " + user;
    }
}
