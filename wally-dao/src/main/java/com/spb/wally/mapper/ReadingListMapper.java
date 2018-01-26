package com.spb.wally.mapper;


import com.spb.wally.domain.entity.BookDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description 读书列表的Mapper接口
 * @author: gaobh
 * @date: 2017/12/12 19:25
 * @version: v1.0
 */
@Component("readingListMapper")
public interface ReadingListMapper {
    /**
     * 根据读者姓名返回读书列表
     * @param reader
     * @return
     */
    @Select("select * from book where reader = #{reader}")
    List<BookDO> findByReader(@Param(value = "reader") String reader);
}
