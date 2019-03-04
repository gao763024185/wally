package com.spb.wally.service.impl;

import com.spb.wally.domain.entity.BaseMenuDO;
import com.spb.wally.mapper.BaseMenuMapper;
import com.spb.wally.service.BaseMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description
 * @author: gaobh
 * @date: 2019/1/30 17:00
 * @version: v1.0
 */
@Service
public class BaseMenuServiceImpl implements BaseMenuService {

    @Resource
    private BaseMenuMapper baseMenuMapper;
    @Override
    public List<BaseMenuDO> findAll() {
        return baseMenuMapper.findAll();
    }
}
