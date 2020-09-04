package com.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger2 配置类
 * 
 * @author JNR
 * @date 2020年9月3日
 * @time 下午6:18:44
 */
@Configuration
@EnableSwagger2 // 开启在线文档
public class Swagger2Config {
	@Bean
	   public Docket createRestApi() {
	       return new Docket(DocumentationType.SWAGGER_2)
	                   .apiInfo(apiInfo())
	                   .select()
	                   .apis(RequestHandlerSelectors.basePackage("com.api")) 
	                   .paths(PathSelectors.any()) // 可以根据url路径设置哪些请求加入文档，忽略哪些请求
	                   .build();
	}
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("文档标题") // 设置文档的标题
				.description("文档描述信息") // 设置文档的描述
				.version("1.0") // 设置文档的版本信息-> 1.0.0 Version information
				.termsOfServiceUrl("http://101.37.32.181:8081/wardemo/student/queryAllStudent")
				.build();
	}

}
