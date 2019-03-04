package com.spb.wally.service;


import com.spb.wally.domain.bo.LogsBO;
import com.spb.wally.domain.entity.LogsDO;
import com.spb.wally.domain.query.LogsQuery;

import java.util.List;

/**
 * @description 用户相关服务类
 * @author: gaobh
 * @date: 2019/01/30 16:35
 * @version: v1.0
 */
public interface LogsService {

    List<LogsBO> getLogsByQuery(LogsQuery query);


    LogsDO getById(String logId);
}
