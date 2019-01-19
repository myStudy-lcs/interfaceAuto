package com.alipay;

import org.testng.annotations.Test;

/**
 * 超时测试
 */
public class TimeOutTest {
    @Test(timeOut = 3000)   // 单位为毫秒值
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("规定时间内 testSuccess方法执行");
    }

    /*时间超时*/
    @Test(timeOut = 3000)   // 单位为毫秒值
    public void testFailed() throws InterruptedException{
        Thread.sleep(5000);
        System.out.println("规定时间内 testFailed方法执行");
    }
}
