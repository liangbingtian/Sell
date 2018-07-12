package com.liang.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * liangbingtian
 * 2018/7/12 下午1:48
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test1(){
        String name = "immoc";
        String password = "123456";
       log.info("name: {}, password: {}",name,password);
       log.error("error...");
    }

}
