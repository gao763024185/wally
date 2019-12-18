package com.spb.wally.service;

import com.spb.wally.domain.entity.BaseUserDO;

import java.util.List;

/**
 * @description 用户相关服务类
 * @author: gaobh
 * @date: 2018/12/26 9:35
 * @version: v1.0
 */
public interface UserInfoService {
    /**
     * 输出所有用户（哈哈 就我一人儿）
     *
     * @return
     */
    List<BaseUserDO> findAll();


    /**
     * 验证用户登录
     *
     * @param user
     * @return
     */
    BaseUserDO loginValid(BaseUserDO user);
}
