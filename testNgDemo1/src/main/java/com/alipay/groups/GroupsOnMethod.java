package com.alipay.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * 组测试-方法分组
 */
public class GroupsOnMethod {

    @Test(groups = "client")
    public void testCase3(){
        System.out.println("客户端的测试方法3");
    }
    @Test(groups = "client")
    public void testCase4(){
        System.out.println("客户端的测试方法4");
    }

    @Test(groups = "server")
    public void testCase1(){
        System.out.println("服务器端测试方法1");
    }
    @Test(groups = "server")
    public void testCase2(){
        System.out.println("服务器端测试方法2");
    }


    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("服务端组方法运行 之前执行");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("服务端组方法运行 之后执行");
        System.out.println("");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("客户端组方法运行 之前执行");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("客户端组方法运行 之后执行");
    }

    /*服务端组方法先执行 客户端在后*/
}
