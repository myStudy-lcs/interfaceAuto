package com.alipay.httpclient;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;


/**
 * @Author: Alan
 * @Date: 2021/8/16 7:57
 * @Email: lcs247735486@163.com
 **/
public class MyHttpClient {
    //HttpGet
    HttpGet httpGet = new HttpGet("http://www.baidu.com");
    //这个是用来执行get方法的
    HttpClient client = new DefaultHttpClient();

    @Test
    public void test() throws IOException {
        //response
        HttpResponse response = client.execute(httpGet);
        //存放获取的响应结果
        String result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println("response响应结果：'\n" + result);
    }
}
