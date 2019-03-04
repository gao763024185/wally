package com.spb.wally.service;

import com.spb.wally.domain.entity.BaseMenuDO;

import java.util.List;

/**
 * @description
 * @author: gaobh
 * @date: 2019/1/30 17:00
 * @version: v1.0
 */
public interface BaseMenuService {
    List<BaseMenuDO> findAll();
}
