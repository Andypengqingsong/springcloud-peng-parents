package com.peng.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 彭青松
 * @project xtone-framework
 * @company 成都信通信息技术有限公司
 * @date 2018-12-19 13:10
 * @description 描述当前类的用途
 */
@RestController
@RefreshScope
public class SpringCloudClientTest {


    @Value("${myww}") // git配置文件里的key
    private String myww;

    @RequestMapping(value = "/hi")
    public String hi() {
        return myww;
    }
}
