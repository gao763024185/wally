package com.spb.wally.mapper;

import com.spb.wally.domain.entity.BaseUserDO;

import java.util.List;

public interface BaseUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BaseUserDO record);

    int insertSelective(BaseUserDO record);

    BaseUserDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseUserDO record);

    int updateByPrimaryKey(BaseUserDO record);

    /**
     * 查出所有的登陆列表
     * @return
     */
    List<BaseUserDO> findAll();
}