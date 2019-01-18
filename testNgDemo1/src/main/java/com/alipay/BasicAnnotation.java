package com.alipay;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("第1条测试用例");
    }
    @Test
    public void testCase2(){
        System.out.println("第2条测试用例");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("~方法运行之前执行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("方法运行之后执行~");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("~~类运行之前执行");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("类运行之后执行~~");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("~~BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件~~");
    }
}
