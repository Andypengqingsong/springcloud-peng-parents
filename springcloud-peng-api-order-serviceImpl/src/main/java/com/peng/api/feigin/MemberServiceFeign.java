package com.peng.api.feigin;

import com.peng.api.service.ImemberService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author 彭青松
 * @project xtone-framework
 * @company 成都信通信息技术有限公司
 * @date 2018-12-11 16:48
 * @description 描述当前类的用途
 */
@FeignClient(value = "member-service")
public interface MemberServiceFeign extends ImemberService {
}
