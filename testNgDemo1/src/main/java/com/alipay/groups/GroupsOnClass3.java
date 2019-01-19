package com.alipay.groups;

import org.testng.annotations.Test;

/**
 * 组测试-类分组
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void tea1(){
        System.out.println("GroupsOnClass3中测试方法1");
    }
    public void tea2(){
        System.out.println("GroupsOnClass3中测试方法2");
    }
}
