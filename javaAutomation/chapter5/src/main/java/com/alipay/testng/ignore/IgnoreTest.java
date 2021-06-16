package com.alipay.testng.ignore;

import org.testng.annotations.Test;

/**
 * @Author: Alan
 * @Date: 2021/6/15 7:48
 * @Email: lcs247735486@163.com
 **/
/*TestNG忽略测试*/
public class IgnoreTest {
    @Test
    public void ignore1() {
        System.out.println("ignore1 执行");
    }

    /*默认enabled=true*/
    @Test(enabled = true)
    public void ignore2() {
        System.out.println("ignore2 执行");
    }

    /*让ignore3不执行*/
    @Test(enabled = false)
    public void ignore3() {
        System.out.println("ignore3 忽略不执行");
    }
}
