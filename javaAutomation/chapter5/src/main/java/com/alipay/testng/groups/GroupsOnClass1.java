package com.alipay.testng.groups;

import org.testng.annotations.Test;

/**
 * @Author: Alan
 * @Date: 2021/6/16 7:39
 * @Email: lcs247735486@163.com
 **/
/*TestNG组测试-类分组*/
@Test(groups = "student")
public class GroupsOnClass1 {
    public void stu1() {
        System.out.println("GroupsOnClass1 中测试方法1.");
    }

    public void stu2() {
        System.out.println("GroupsOnClass1 中测试方法2.");
    }
}
