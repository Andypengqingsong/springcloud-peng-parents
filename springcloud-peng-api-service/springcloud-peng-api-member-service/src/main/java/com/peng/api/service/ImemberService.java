package com.peng.api.service;

import com.peng.api.domain.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface ImemberService {

    @RequestMapping("/getMember")
    public UserEntity getMember(@RequestParam("name")String name);
}
