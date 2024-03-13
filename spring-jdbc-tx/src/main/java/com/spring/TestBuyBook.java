package com.spring;

import com.spring.Controller.BookController;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestBuyBook {
    @Resource
    private BookController bookController;

    @Test
    public void testBuyBook(){
        bookController.buyBook(2,1);
    }
}
