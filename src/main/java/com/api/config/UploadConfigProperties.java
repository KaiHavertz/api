package com.api.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author: JNR
 * @create: 2020/8/31 18:54
 * @description: 文件上传配置类
 * @jdk: 1.8
 */
// upload ：yml 的key, baseUrl 对应 yml upload 节点下面的 base-url key
@Data//get set
@ConfigurationProperties(prefix = "upload")
public class UploadConfigProperties {
    private  String baseUrl;
    private List<String> allowTypes;
}