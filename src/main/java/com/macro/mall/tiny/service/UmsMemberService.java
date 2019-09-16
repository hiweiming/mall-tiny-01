package com.macro.mall.tiny.service;

import com.macro.mall.tiny.common.api.CommonResult;

/**
 * UmsMemberService
 * 创建人: yuanweiming
 *
 * @author YuanWeiMing
 * @version 1.0
 * 2019/9/2 14:54
 **/
public interface UmsMemberService {
    CommonResult getAuthCode(String telephone);

    CommonResult verifyAuthCode(String telephone, String authCode);
}
