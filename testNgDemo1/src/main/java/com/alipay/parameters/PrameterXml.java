package com.alipay.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * xml文件参数化测试
 */
public class PrameterXml {
    @Test
    @Parameters({"name","age"})
    public void testCase1(String name,int age){
        System.out.println("姓名："+ name +"\t\t年龄："+ age);
    }
}
