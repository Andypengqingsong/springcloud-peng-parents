package com.peng.api.service;

import org.springframework.web.bind.annotation.RequestMapping;

public interface IorderService {
    @RequestMapping("/getOrder")
    public String getOrder(String name);
}
