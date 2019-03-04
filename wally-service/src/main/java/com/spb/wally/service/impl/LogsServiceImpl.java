package com.spb.wally.service.impl;

import com.spb.wally.domain.bo.LogsBO;
import com.spb.wally.domain.entity.LogsDO;
import com.spb.wally.domain.query.LogsQuery;
import com.spb.wally.mapper.LogsMapper;
import com.spb.wally.service.LogsService;
import com.spb.wally.utils.BeanUtil;
import com.spb.wally.utils.DateUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.thymeleaf.util.DateUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description
 * @author: gaobh
 * @date: 2019/1/30 16:58
 * @version: v1.0
 */
@Service
public class LogsServiceImpl implements LogsService {
    @Resource
    private LogsMapper logsMapper;


    @Override
    public List<LogsBO> getLogsByQuery(LogsQuery query) {
        List<LogsDO> logsDOS = logsMapper.getLogsByQuery(query);
        if (CollectionUtils.isEmpty(logsDOS)){
            return null;
        }
        List<LogsBO> logsBOS = BeanUtil.copyList(logsDOS,LogsBO.class);
        for (LogsBO logs :logsBOS) {
            logs.setGmtCreateStr(DateUtil.format(logs.getGmtCreate(),DateUtil.DATE_FORMAT));
        }
        return logsBOS;
    }

    @Override
    public LogsDO getById(String logId) {
        return logsMapper.selectByPrimaryKey(logId);
    }
}
