package com.alipay.extentreport;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testMethod {
    /*正确的判断*/
    @Test
    public void testCase1(){
        Assert.assertEquals(1,1);
        System.out.println("测试testCase1");
    }
    /*错误的判断*/
    @Test
    public void testCase2(){
        Assert.assertEquals(1,2);
        System.out.println("测试testCase2");
    }
    /*一个断言*/
    @Test
    public void testCase3(){
        Assert.assertEquals("aaa","aaa");
        System.out.println("执行一条断言");
    }


    /*日志记录*/
    @Test
    public void logMethod(){
        Reporter.log("自己的log日志");
        throw new RuntimeException("自己的运行时异常");
    }
}
