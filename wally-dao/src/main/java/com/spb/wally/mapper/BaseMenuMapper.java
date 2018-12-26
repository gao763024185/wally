package com.spb.wally.mapper;

import com.spb.wally.domain.entity.BaseMenuDO;

/**
 * @description 目录
 * @author: gaobh
 * @date: 2018/12/26 9:24
 * @version: v1.0
 */
public interface BaseMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BaseMenuDO record);

    int insertSelective(BaseMenuDO record);

    BaseMenuDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseMenuDO record);

    int updateByPrimaryKey(BaseMenuDO record);
}