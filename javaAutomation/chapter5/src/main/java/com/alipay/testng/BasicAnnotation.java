package com.alipay.testng;

import org.testng.annotations.*;

/**
 * @Author: Alan
 * @Date: 2021/6/14 22:46
 * @Email: lcs247735486@163.com
 **/
/*基本注解*/
public class BasicAnnotation {

    /*最基本的注解，把方法标记为测试的一部分*/
    @Test
    public void testCase1() {
        System.out.println("Test:测试用例case1");
    }

    @Test
    public void testCase2() {
        System.out.println("Test:测试用例case2");
    }

    /*每个方法运行前后都会执行一次*/
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod:测试方法运行之前执行~");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod:测试方法运行之后执行~");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass:类运行之前执行~~");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass:类运行之后执行~~");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite:测试套件运行之前~~~");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite:测试套件运行之后~~~");
    }
}
