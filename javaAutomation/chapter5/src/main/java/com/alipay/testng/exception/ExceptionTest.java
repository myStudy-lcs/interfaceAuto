package com.alipay.testng.exception;

import org.testng.annotations.Test;

/**
 * @Author: Alan
 * @Date: 2021/6/16 22:09
 * @Email: lcs247735486@163.com
 **/
/*TestNG异常测试*/
public class ExceptionTest {
    /*失败的异常测试*/
//    @Test(expectedExceptions = RuntimeException.class)
//    public void runTimeExceptionFailed() {
//        System.out.println("测试结果会失败的异常测试~");
//    }


    /*成功的异常测试*/
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.println("这是我的异常测试~");
        throw new RuntimeException();
    }
}

/**
 * 什么时候会用到异常测试？
 * 在我们期望结果为某一个异常的时候
 * 比如：我们传入了某些不合法的参数，程序抛出了异常；
 * 也就是说 我的预期结果就是这个异常
 **/
