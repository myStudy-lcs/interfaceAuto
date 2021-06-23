package com.alipay.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @Author: Alan
 * @Date: 2021/6/23 7:38
 * @Email: lcs247735486@163.com
 **/
/*TestNG多线程测试-注解方式实现*/
public class MultiThreadOnAnnotation {
    /*10个线程运行,有3个线程池*/
    @Test(invocationCount = 10, threadPoolSize = 3)
    public void caseTest() {
        System.out.println("1");// 打印出10个数字1
        System.out.printf("线程池 : %s%n", Thread.currentThread().getId());
    }

//    @Test(invocationCount = 6)
//    public void case1() {
//        System.out.println("1");// 打印出10个数字1
//    }

    @Test(invocationCount = 6)
    public void case2() {
        System.out.println("1");// 打印出10个数字1
        System.out.printf("Thread Id:" + Thread.currentThread().getId());
    }
}
