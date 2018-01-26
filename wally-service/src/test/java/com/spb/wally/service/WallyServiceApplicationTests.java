package com.spb.wally.service;

import com.spb.wally.WallyMapperApplication;
import com.spb.wally.domain.entity.BookDO;
import com.spb.wally.mapper.ReadingListMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { WallyMapperApplication.class})
@MapperScan("com.spb.wally.dao")
@ComponentScan("com.spb.wally.dao")
public class WallyServiceApplicationTests {

    @Autowired
    private ReadingListMapper readingListMapper;
    @Test
    public void contextLoads() {
        List<BookDO> list = readingListMapper.findByReader("gbh");
        System.out.println(list == null ? 123 : list.size());
    }

}
