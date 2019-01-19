package com.alipay;

import org.testng.annotations.Test;

/**
 * 忽略测试
 */
public class IgnoreTest {
    @Test
    public void testCase1(){
        System.out.println("测试1执行");
    }
//    让testCase2不执行 默认enable = true
    @Test(enabled = false)
    public void testCase2(){
        System.out.println("测试2执行");
    }
}
