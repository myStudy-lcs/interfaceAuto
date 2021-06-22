package com.alipay.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @Author: Alan
 * @Date: 2021/6/22 8:04
 * @Email: lcs247735486@163.com
 **/
/*TestNG参数化测试-通过xml配置项传递参数*/
public class ParameterXml {
    @Test
    @Parameters({"name","age"})
    public void testCase(String name,int age){
        System.out.println("姓名：" + name + "\t\t年龄：" + age);
    }
}
