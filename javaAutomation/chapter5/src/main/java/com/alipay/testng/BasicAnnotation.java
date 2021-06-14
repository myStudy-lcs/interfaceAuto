package com.alipay.testng;

import org.testng.annotations.Test;

/**
 * @Author: Alan
 * @Date: 2021/6/14 22:46
 * @Email: lcs247735486@163.com
 **/
/*基本注解*/
public class BasicAnnotation {
    /*最基本的注解，把方法标记为测试的一部分*/
    @Test
    public void testCase1() {
        System.out.println("测试用例case1");
    }
}
