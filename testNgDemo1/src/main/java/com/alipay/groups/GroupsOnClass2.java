package com.alipay.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass2 {

    public void stu1(){
        System.out.println("GroupsOnClass2中测试方法1");
    }
    public void stu2(){
        System.out.println("GroupsOnClass2中测试方法2");
    }
}