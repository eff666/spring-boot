package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import com.demo.util.PropertiesUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ProPertiesTest {

	
	@Autowired
    private PropertiesUtil neoProperties;


    @Test
    public void getHello() throws Exception {
    	System.out.println(neoProperties.getTitle());
        Assert.assertEquals(neoProperties.getTitle(), "spring-boot-web");
        Assert.assertEquals(neoProperties.getDescription(), "spring-boot-web");
    }

    
    @Test
    public void testMap() throws Exception {
    	Map<String, Long> orderMinTime=new HashMap<String, Long>();
    	long xx=orderMinTime.get("123");
    }

}