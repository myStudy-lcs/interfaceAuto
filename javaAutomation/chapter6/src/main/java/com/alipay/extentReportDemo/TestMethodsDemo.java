package com.alipay.extentReportDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @Author: Alan
 * @Date: 2021/6/28 8:07
 * @Email: lcs247735486@163.com
 **/
public class TestMethodsDemo {

    @Test
    public void case1() {
        Assert.assertEquals(1, 2);
    }

    @Test
    public void case2() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void case3() {
        Assert.assertEquals("abc", "abc");
    }

    //    日志记录
    @Test
    public void logDemo() {
        Reporter.log("自己的log日志--");
        throw new RuntimeException("自己的运行时异常~~");
    }
}
