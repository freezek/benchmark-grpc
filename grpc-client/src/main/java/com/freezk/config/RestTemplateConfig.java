package com.freezk.config;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

public class RestTemplateConfig {

    private static RestTemplate restTemplate;

    static {
        // 长链接保持时间长度20秒
        PoolingHttpClientConnectionManager poolingHttpClientConnectionManager =
                new PoolingHttpClientConnectionManager(20, TimeUnit.SECONDS);
        // 设置最大链接数
        poolingHttpClientConnectionManager.setMaxTotal(2*getMaxCpuCore() + 3 );
        // 单路由的并发数
        poolingHttpClientConnectionManager.setDefaultMaxPerRoute(2*getMaxCpuCore());

        HttpClientBuilder httpClientBuilder = HttpClients.custom();
        httpClientBuilder.setConnectionManager(poolingHttpClientConnectionManager);

        // 重试次数3次，并开启
        httpClientBuilder.setRetryHandler(new DefaultHttpRequestRetryHandler(3,true));
        HttpClient httpClient = httpClientBuilder.build();
        // 保持长链接配置，keep-alive
        httpClientBuilder.setKeepAliveStrategy(new DefaultConnectionKeepAliveStrategy());

        HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);

        // 链接超时配置 5秒
        httpComponentsClientHttpRequestFactory.setConnectTimeout(5000);
        // 连接读取超时配置
//        httpComponentsClientHttpRequestFactory.setReadTimeout(10000);
        // 连接池不够用时候等待时间长度设置，分词那边 500毫秒 ，我们这边设置成1秒
        httpComponentsClientHttpRequestFactory.setConnectionRequestTimeout(3000);

        // 缓冲请求数据，POST大量数据，可以设定为true 我们这边机器比较内存较大
        httpComponentsClientHttpRequestFactory.setBufferRequestBody(true);

        restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(httpComponentsClientHttpRequestFactory);
        restTemplate.setErrorHandler(new DefaultResponseErrorHandler());
    }

    public static RestTemplate getRestTemplate(){
        return restTemplate;
    }

    private static int getMaxCpuCore(){
        int cpuCore = Runtime.getRuntime().availableProcessors();
        return  cpuCore;
    }

}
