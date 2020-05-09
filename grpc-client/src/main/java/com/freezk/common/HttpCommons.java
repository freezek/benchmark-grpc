package com.freezk.common;

import com.freezk.config.RestTemplateConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeType;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

@Component(value = "baseComponents")
public class HttpCommons {

    private static final Logger logger = LoggerFactory.getLogger(HttpCommons.class);

    private RestTemplate restTemplate;

    /**
     * 请求 API 封装
     * @param url 请求完整地址
     * @param method 请求方式
     * @param responseBodyType 返回类型
     * @param requestBody 请求参数实体
     * @param <T> 返回类型
     * @param <A> 参数类型
     * @return
     */
    public  <T, A> T exchange(String url, HttpMethod method, ParameterizedTypeReference<T> responseBodyType, A requestBody) {
        long startTime = System.currentTimeMillis();
        ResponseEntity<T> resultEntity = new ResponseEntity<T>(HttpStatus.SERVICE_UNAVAILABLE);
        try {
            // 请求头
            HttpHeaders headers = new HttpHeaders();
            MimeType mimeType = MimeTypeUtils.parseMimeType("application/json");
            MediaType mediaType = new MediaType(mimeType.getType(), mimeType.getSubtype(), Charset.forName("UTF-8"));
            // 请求体
            headers.setContentType(mediaType);
            // 发送请求
            HttpEntity<A> entity = new HttpEntity<>(requestBody, headers);
            restTemplate = RestTemplateConfig.getRestTemplate();
            resultEntity = restTemplate.exchange(url, method, entity, responseBodyType);
        } catch (Throwable e) {
        }finally {
            return resultEntity.getBody();
        }
    }
}
