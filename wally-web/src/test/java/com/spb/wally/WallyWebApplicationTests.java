package com.spb.wally;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * '@SpringApplicationConfiguration'  在1.4.0以后就过期了，被@SpringBootTest取代
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class WallyWebApplicationTests {

	@Test
	public void contextLoads() {
	}

}
