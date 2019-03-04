package com.spb.wally.mapper;

import com.spb.wally.domain.entity.BaseMenuDO;

import java.util.List;

/**
 * @description 菜单
 * @author: gaobh
 * @date: 2019/01/31
 * @version: v1.0
 */
public interface BaseMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BaseMenuDO record);

    int insertSelective(BaseMenuDO record);

    BaseMenuDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseMenuDO record);

    int updateByPrimaryKey(BaseMenuDO record);

    List<BaseMenuDO> findAll();
}