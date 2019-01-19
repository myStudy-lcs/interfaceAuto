package com.alipay.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * 套件的配置
 */
public class SuitConfig {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("~before suite 运行");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite 运行~");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("--beforeTest");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("afterTest--");
    }
}
