package com.alipay.testng.multiThread;

import org.testng.annotations.*;

/**
 * @Author: Alan
 * @Date: 2021/6/23 23:05
 * @Email: lcs247735486@163.com
 **/
/*TestNG多线程测试-xml文件实现*/
public class BasicAnnotationOnXml {
    /*最基本的注解，把方法标记为测试的一部分*/
    @Test
    public void testCase1() {
        System.out.printf("Test:测试用例case1  线程%s%n", Thread.currentThread().getId());
    }

    @Test
    public void testCase2() {
        System.out.printf("Test:测试用例case2  线程%s%n", Thread.currentThread().getId());
    }

    /*每个方法运行前后都会执行一次*/
    @BeforeMethod
    public void beforeMethod() {
        System.out.printf("BeforeMethod:测试方法运行之前执行~  线程%s%n", Thread.currentThread().getId());
    }

    @AfterMethod
    public void afterMethod() {
        System.out.printf("AfterMethod:测试方法运行之后执行~  线程%s%n", Thread.currentThread().getId());
    }

    @BeforeClass
    public void beforeClass() {
        System.out.printf("BeforeClass:类运行之前执行~~  线程%s%n", Thread.currentThread().getId());
    }

    @AfterClass
    public void afterClass() {
        System.out.printf("AfterClass:类运行之后执行~~  线程%s%n", Thread.currentThread().getId());
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.printf("BeforeSuite:测试套件运行之前~~~  线程%s%n", Thread.currentThread().getId());
    }

    @AfterSuite
    public void afterSuite() {
        System.out.printf("AfterSuite:测试套件运行之后~~~  线程%s%n", Thread.currentThread().getId());
    }
}
