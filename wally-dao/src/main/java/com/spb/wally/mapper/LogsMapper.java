package com.spb.wally.mapper;

import com.spb.wally.domain.entity.LogsDO;
import com.spb.wally.domain.query.LogsQuery;

import java.util.List;

public interface LogsMapper {
    int deleteByPrimaryKey(String id);

    int insert(LogsDO record);

    int insertSelective(LogsDO record);

    LogsDO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(LogsDO record);

    int updateByPrimaryKey(LogsDO record);

    /**
     * 根据查询条件查询数据
     * @param query
     * @return
     */
    List<LogsDO> getLogsByQuery(LogsQuery query);

    /**
     * 根据查询参数查询数据条数
     * @param query
     * @return
     */
    int logsCount(LogsQuery query);
}