package com.alipay.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * 通过对象传递参数
 */
public class DataProviderTest {

    @Test(dataProvider = "dataMethod")
    public void testCase2(String name,int age){
        System.out.println("方法2中：姓名："+ name + "\t\t年龄："+ age);
    }
    @Test(dataProvider = "dataMethod")
    public void testCase3(String name,int age){
        System.out.println("方法3中：姓名："+ name + "\t\t年龄："+ age);
    }
    @DataProvider(name = "dataMethod")
    public Object[][] dataMethodProvider(Method method){
        Object[][] results = null;
        if (method.getName().equals("testCase2")){
            results = new Object[][]{
                    {"李思思",18},
                    {"张无忌",29},
                    {"宋公明",32}
            };
        }else if (method.getName().equals("testCase3")){
            results = new Object[][]{
                    {"莉莉",22},
                    {"吕蒙",25}
            };
        }
        return results;
    }

//==========================================================================

    @Test(dataProvider = "data")
    public void testCase1(String name,int age){
        System.out.println("姓名："+ name +"\t\t年龄："+ age);
    }
    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        Object[][] objects = new Object[][]{
                {"张三",28},
                {"王五",22},
                {"李江",19}
        };
        return objects;
    }
}
