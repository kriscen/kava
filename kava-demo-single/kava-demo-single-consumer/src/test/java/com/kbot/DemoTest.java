package com.kbot;

import com.kbot.demo.Demo;
import com.kbot.service.IDemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Program Name: kava-demo-single
 * <p>
 * Description: 
 * <p>
 * Created by kris on 2021/2/5
 *
 * @author kris
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest {
    @Autowired
    IDemoService demoService;

    @Test
    public void saveTest(){
        BigDecimal b = new BigDecimal("0.0");
        System.out.println(b);
        System.out.println(BigDecimal.ZERO);
        System.out.println(b.compareTo(BigDecimal.ZERO)==0);
    }
}
