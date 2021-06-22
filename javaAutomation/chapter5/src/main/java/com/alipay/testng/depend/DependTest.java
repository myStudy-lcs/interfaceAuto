package com.alipay.testng.depend;

import org.testng.annotations.Test;

/**
 * @Author: Alan
 * @Date: 2021/6/17 7:32
 * @Email: lcs247735486@163.com
 **/
/*TestNG依赖测试*/
public class DependTest {
    @Test
    public void case1() {
        System.out.println("测试方法1`");
    }

    @Test
    public void case2() {
        System.out.println("测试方法2`");
        /*设定测试方法2不能被执行*/
        throw new RuntimeException();
    }

    /*依赖于其它测试方法，才能被执行*/
//    @Test(dependsOnMethods = {"case1"})
    @Test(dependsOnMethods = {"case2"})
    public void case3() {
        System.out.println("测试方法3`");
    }
}
/**
 * 依赖哪个方法，哪个方法就先执行
 * 如果被依赖的方法执行失败，该方法就不被执行；被依赖的方法成功，该方法才被执行。
 * 比如登陆失败，就不能进行后面的购买操作。
 **/
