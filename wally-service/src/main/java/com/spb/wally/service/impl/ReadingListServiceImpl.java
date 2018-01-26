package com.spb.wally.service.impl;

import com.spb.wally.domain.entity.BookDO;
import com.spb.wally.mapper.ReadingListMapper;
import com.spb.wally.service.ReadingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description 读书列表service实现类
 * @author: gaobh
 * @date: 2018/1/11 11:12
 * @version: v1.0
 */
@Service
public class ReadingListServiceImpl implements ReadingListService {

    @Autowired
    private ReadingListMapper readingListMapper;

    /**
     * 根据读者姓名返回读书列表
     *
     * @param reader
     * @return
     */
    @Override
    public List<BookDO> findByReader(String reader) {
        return readingListMapper.findByReader(reader);
    }
}
