package com.alipay.groups;

import org.testng.annotations.Test;

/**
 * 组测试-类分组
 */
@Test(groups = "student")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupsOnClass1中测试方法1");
    }
    public void stu2(){
        System.out.println("GroupsOnClass1中测试方法2");
    }
}
