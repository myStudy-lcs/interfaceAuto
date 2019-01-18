package com.alipay;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
}
