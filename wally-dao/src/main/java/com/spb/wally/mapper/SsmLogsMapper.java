package com.spb.wally.mapper;

import com.spb.wally.domain.entity.SsmLogsDO;

/**
 * @description 日志文章
 * @author: gaobh
 * @date: 2018/12/26 9:24
 * @version: v1.0
 */
public interface SsmLogsMapper {
    int deleteByPrimaryKey(String id);

    int insert(SsmLogsDO record);

    int insertSelective(SsmLogsDO record);

    SsmLogsDO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SsmLogsDO record);

    int updateByPrimaryKey(SsmLogsDO record);
}