package com.alipay.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @Author: Alan
 * @Date: 2021/6/17 7:54
 * @Email: lcs247735486@163.com
 **/
/*TestNG参数化测试-通过对象传递参数*/
public class DataProviderTest {


    @Test(dataProvider = "methodData")
    public void case2(String name, int age) {
        System.out.println("case2方法：姓名 = " + name + ";  年龄 = " + age);
    }

    @Test(dataProvider = "methodData")
    public void case3(String name, int age) {
        System.out.println("case3方法：姓名 = " + name + ";  年龄 = " + age);
    }

    /*通过方法传递参数*/
    @DataProvider(name = "methodData")
    public Object[][] methodDataProvider(Method method) {
        Object[][] objResults = null;
        if (method.getName().equals("case2")) {
            objResults = new Object[][]{
                    {"李逵", 22}, {"林冲", 28}, {"张青", 26}
            };
        } else if (method.getName().equals("case3")) {
            objResults = new Object[][]{
                    {"贾宝玉", 21}, {"薛宝钗", 19}
            };
        }
        return objResults;
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    @Test(dataProvider = "dataTest")
    public void case1(String name, int age) {
        System.out.println("姓名：" + name + ";  年龄：" + age);
    }

    /*通过对象传递参数*/
    @DataProvider(name = "dataTest")
    public Object[][] dataTestProvider() {
        Object[][] objects = new Object[][]{
                {"刘备", 31}, {"张飞", 27}, {"关羽", 30}
        };
        return objects;
    }

}
