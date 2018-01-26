package com.spb.wally.service;

import com.spb.wally.domain.entity.BookDO;

import java.util.List;

/**
 * @description 读书列表service接口
 * @author: gaobh
 * @date: 2018/1/11 11:11
 * @version: v1.0
 */
public interface ReadingListService {

    /**
     * 根据读者姓名返回读书列表
     * @param reader
     * @return
     */
    List<BookDO> findByReader(String reader);
}
