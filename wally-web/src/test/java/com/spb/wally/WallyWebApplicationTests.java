package com.spb.wally;

import com.spb.wally.mapper.BaseUserMapper;
import com.spb.wally.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * '@SpringApplicationConfiguration'  在1.4.0以后就过期了，被@SpringBootTest取代
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class WallyWebApplicationTests {

    @Resource
    private UserInfoService userInfoService;
    @Resource
    private BaseUserMapper baseUserMapper;

    @Test
    public void contextLoads() {
        System.out.println(userInfoService.print());
        System.out.println(baseUserMapper.selectByPrimaryKey(1).getPassword());
    }

}
