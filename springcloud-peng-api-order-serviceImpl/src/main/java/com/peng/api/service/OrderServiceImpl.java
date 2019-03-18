package com.peng.api.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.peng.api.domain.UserEntity;
import com.peng.api.feigin.MemberServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 彭青松
 * @project xtone-framework
 * @company 成都信通信息技术有限公司
 * @date 2018-12-11 16:47
 * @description 描述当前类的用途
 */
@RestController
@RefreshScope
public class OrderServiceImpl implements IorderService {
    @Value("${server.port}")
    private String port;

    @Value("${myww:未获得值}") // git配置文件里的key
    private String myww;

    @Autowired
    private MemberServiceFeign memberServiceFeign;

    /*
    如果getOrder调用失败就调用hiError；
     */
    @HystrixCommand(fallbackMethod = "hiError")
    @RequestMapping("/getOrder")
    @Override
    public String getOrder(String name) {

        UserEntity member = memberServiceFeign.getMember(name);
        return member == null ? "服务" + port + "  调用会员服务失败" : "服务" + port + "   " + member.toString()
                + "获取配置中心值myww=" + myww;
        // return "xxx";

    }

    @RequestMapping("/")
    public String getOrderssend(String name) {

        return "我是订单服务。。。。1。。。。。。。。";

    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }

}
