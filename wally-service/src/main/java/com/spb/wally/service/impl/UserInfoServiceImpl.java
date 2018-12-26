package com.spb.wally.service.impl;

import com.spb.wally.mapper.BaseUserMapper;
import com.spb.wally.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @description 用户相关服务类
 * @author: gaobh
 * @date: 2018/12/26 9:35
 * @version: v1.0
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private BaseUserMapper baseUserMapper;
    @Override
    public String print() {
        return baseUserMapper.selectByPrimaryKey(1).getUserName();
    }
}