package com.alipay;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author ：web-lcs509306
 * @Date ：2019/3/20 - 17:19
 * 获取一个 get/psot 请求地址的返回数据
 */
public class RequestTest {
    @Test
    public void getTest() throws IOException {
        /**
         * @Author ：        Created by Alan
         * @Description ：   发送一个get请求
         * @Date ：          22:47 — 2019/3/20
         * @Param ：         []
         * @return ：        void
         */
        // 请求URL地址
        String url = "https://tieba.baidu.com/f";
        // get请求
        url += "?fr=ala0&kw=%B2%E2%CA%D4%B9%A4%B3%CC%CA%A6&tpl=5";

        // 封装一个get请求方式
        HttpGet get = new HttpGet(url);

        // 发送请求的一个客户端
//        HttpClient httpClient = new DefaultHttpClient();
        HttpClient httpClient = HttpClients.createDefault();
        // 执行请求,得到response响应
        HttpResponse response = httpClient.execute(get);

        // 提取响应返回的数据
        String result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);
    }

    @Test
    public void postTest() throws IOException {
        /**
         * @Author ：        Created by Alan
         * @Description ：   发送一个post请求
         * @Date ：          22:47 — 2019/3/20
         * @Param ：         []
         * @return ：        void
         */
        // 请求URL地址
        String url = "http://bkmagicprod.sit.mayibank.net/home/bkcloudfundsTrade/openBalancePay";
        // 封装一个post请求方式
        HttpPost post = new HttpPost(url);

        // post请求 请求参数封装在请求体中(没有参数可以不写)
        List<NameValuePair> parameters = new ArrayList<NameValuePair>();
        parameters.add(new BasicNameValuePair("context", "%7B%22nid%22%3A%22news_9106617718834593716%22%7D"));
        parameters.add(new BasicNameValuePair("n_type", "0"));
        parameters.add(new BasicNameValuePair("p_from", "1"));
        // 设置参数的请求体
//        post.setEntity(new UrlEncodedFormEntity(parameters));
//        url += "?context=%7B%22nid%22%3A%22news_9106617718834593716%22%7D&n_type=0&p_from=1";

        // 发送请求的一个客户端
//        HttpClient httpClient = new DefaultHttpClient();
        HttpClient httpClient = HttpClients.createDefault();
        // 执行请求,得到response响应
        HttpResponse response = httpClient.execute(post);

        // 提取响应返回的数据
        String result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);
    }
}
