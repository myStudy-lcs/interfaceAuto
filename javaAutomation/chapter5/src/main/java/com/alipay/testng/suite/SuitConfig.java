package com.alipay.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @Author: Alan
 * @Date: 2021/6/15 6:56
 * @Email: lcs247735486@163.com
 **/
/*suite套件的配置-关联suite.xml*/
public class SuitConfig {

    @BeforeSuite
    public void beforeSuite() {
        System.out.print("BeforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite");
    }

    /*测试BeforeTest方法*/
    @BeforeTest
    public void beforeTest() {
        System.out.print("BeforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.print("AfterTest");
    }
}
