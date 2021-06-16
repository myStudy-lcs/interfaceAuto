package com.alipay.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @Author: Alan
 * @Date: 2021/6/16 7:40
 * @Email: lcs247735486@163.com
 **/
/*TestNG组测试-组在方法上*/
public class GroupsOnMethod {
    /*服务端组的测试方法先执行 客户端在后*/

    @Test(groups = "client")
    public void test3() {
        System.out.println("客户端组的测试方法333");
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("客户端组的测试方法444");
    }

    @Test(groups = "server")
    public void test1() {
        System.out.println("服务端组的测试方法111");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("服务端组的测试方法222");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient() {
        System.out.println("BeforeGroups：客户端组的测试方法运行之前！！！");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient() {
        System.out.println("AfterGroups：客户端组的测试方法运行之后！！！");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer() {
        System.out.println("BeforeGroups：服务端组的测试方法运行之前！！！");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer() {
        System.out.println("AfterGroups：服务端组的测试方法运行之后！！！");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
