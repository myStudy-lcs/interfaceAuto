package com.alipay.testng.timeOut;

import org.testng.annotations.Test;
import sun.security.krb5.internal.TGSRep;

/**
 * @Author: Alan
 * @Date: 2021/6/24 7:58
 * @Email: lcs247735486@163.com
 **/
/*TestNG超时测试*/
public class TimeOutTest {
    @Test(timeOut = 3000)   //3000毫秒-3秒
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000); //等待2秒
        System.out.println("规定时间内,成功执行~");
    }

    @Test(timeOut = 3000)   //3000毫秒-3秒
    public void testFailed() throws InterruptedException {
        Thread.sleep(5000); //等待5秒-时间超时
        System.out.println("规定时间内,执行失败~");
    }
}
