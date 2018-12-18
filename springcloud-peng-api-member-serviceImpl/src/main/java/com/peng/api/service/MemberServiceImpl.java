package com.peng.api.service;

import com.peng.api.domain.UserEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 彭青松
 * @project xtone-framework
 * @company 成都信通信息技术有限公司
 * @date 2018-12-11 16:31
 * @description 描述当前类的用途
 */
@RestController
public class MemberServiceImpl implements ImemberService {
    @Value("${server.port}")
    private String port;


    @RequestMapping("/getMember")
    @Override
    public UserEntity getMember( @RequestParam("name")String name) {
        UserEntity userEntity = new UserEntity(name, 20, port);
        return userEntity;
    }
}
