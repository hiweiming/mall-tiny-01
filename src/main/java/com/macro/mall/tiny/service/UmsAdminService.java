package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.UmsAdmin;
import com.macro.mall.tiny.mbg.model.UmsPermission;

import java.util.List;

/**
 * UmsAdminService
 * 创建人: yuanweiming
 *
 * @author YuanWeiMing
 * @version 1.0
 * 2019/9/2 16:04
 **/
public interface UmsAdminService {
    UmsAdmin register(UmsAdmin umsAdminParam);

    String login(String username, String password);

    List<UmsPermission> getPermissionList(Long adminId);
}
