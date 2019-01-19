package com.alipay.multiThread;

import org.testng.annotations.Test;

/**
 * 基于注解的多线程测试
 */
/*10个线程运行 一共3个线程池*/
public class MultiThreadOnAnnotation {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void testCase1(){
        System.out.println("1");    /*打印出10个1数字*/
        System.out.println(Thread.currentThread().getId()); /*出现3个线程池：11 12 13*/
    }
}
