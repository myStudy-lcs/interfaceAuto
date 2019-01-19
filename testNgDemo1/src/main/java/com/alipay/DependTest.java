package com.alipay;

import org.testng.annotations.Test;

/**
 * 依赖测试
 */
public class DependTest {

    @Test
    public void testCase1(){
        System.out.println("测试方法1 执行");
    }
    @Test
    public void testCase2(){
        System.out.println("测试方法2 执行");
        /*设定测试方法2 不能执行*/
        throw new RuntimeException();
    }

    /*依赖于其它测试方法 才可执行*/
//    @Test(dependsOnMethods = {"testCase1"})
    @Test(dependsOnMethods = {"testCase2"})
    public void testCase3(){
        System.out.println("测试方法3 执行");
    }
}
