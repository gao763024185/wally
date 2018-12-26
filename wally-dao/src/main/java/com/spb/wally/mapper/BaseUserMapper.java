package com.spb.wally.mapper;

import com.spb.wally.domain.entity.BaseUserDO;

/**
 * @description 用户信息
 * @author: gaobh
 * @date: 2018/12/26 9:24
 * @version: v1.0
 */
public interface BaseUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BaseUserDO record);

    int insertSelective(BaseUserDO record);

    BaseUserDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseUserDO record);

    int updateByPrimaryKey(BaseUserDO record);
}