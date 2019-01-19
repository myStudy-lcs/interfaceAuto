package com.alipay.multiThread;

import org.testng.annotations.Test;

/**
 * 基于xml文件的多线程测试
 */
public class MultiThreadOnXml {
    @Test
    public void testCase1(){
        System.out.println("方法1："+Thread.currentThread().getId());
    }
    @Test
    public void testCase2(){
        System.out.println("方法2："+Thread.currentThread().getId());
    }
    @Test
    public void testCase3(){
        System.out.println("方法3："+Thread.currentThread().getId());
    }
}
