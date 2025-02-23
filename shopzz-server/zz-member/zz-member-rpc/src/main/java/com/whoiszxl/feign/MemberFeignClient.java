package com.whoiszxl.feign;

import com.whoiszxl.bean.ResponseResult;
import com.whoiszxl.config.OAuth2FeignConfig;
import com.whoiszxl.dto.MemberAddressDTO;
import com.whoiszxl.dto.MemberAddressFeignDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 会员feign接口
 *
 * @author whoiszxl
 * @date 2021/7/30
 */
@FeignClient(name = "zz-member-web", contextId = "memberFeign", configuration = OAuth2FeignConfig.class)
public interface MemberFeignClient {

    /**
     * 通过地址ID查询当前用户的地址信息
     * @param addressId 地址ID
     * @return
     */
    @GetMapping("/getMemberAddress")
    ResponseResult<MemberAddressFeignDTO> getMemberAddress(@RequestParam Long addressId);

}
