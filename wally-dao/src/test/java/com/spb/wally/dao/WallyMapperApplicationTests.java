package com.spb.wally.dao;

import com.spb.wally.WallyMapperApplication;
import com.spb.wally.domain.entity.BookDO;
import com.spb.wally.mapper.ReadingListMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WallyMapperApplication.class)
public class WallyMapperApplicationTests {

	@Autowired
	private ReadingListMapper readingListMapper;
	@Test
	public void contextLoads() {
		List<BookDO> list = readingListMapper.findByReader("gbh");
		System.out.println(list.size());
	}
}
