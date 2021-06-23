package com.alipay.testng.multiThread;

import org.testng.annotations.Test;
/**
 * @Author: Alan
 * @Date: 2021/6/23 22:27
 * @Email: lcs247735486@163.com
 **/
/*TestNG多线程测试-xml文件实现*/
public class MultiThreadOnXml {
    @Test
    public void testCase1() {
        System.out.printf("case1  线程%s%n", Thread.currentThread().getId());
    }

    @Test
    public void testCase2() {
        System.out.printf("case2  线程%s%n", Thread.currentThread().getId());
    }

    @Test
    public void testCase3() {
        System.out.printf("case3  线程%s%n", Thread.currentThread().getId());
    }
}
