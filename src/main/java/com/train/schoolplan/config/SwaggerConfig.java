/**
 * -*- codeing = utf-8 -*-
 *
 * @Time :2021/8/1 17:29
 * @Author :zhou_pig
 * @File :SwaggerConfig.java
 * @Software :IntelliJ IDEA
 */
package com.train.schoolplan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2//开启swagger2
public class SwaggerConfig {
    //配置了Swagger的Docket的bean实例
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .build();

    }
    public ApiInfo apiInfo(){
        Contact contact=new Contact("基因重组","localhost:8081/index","1691441008@qq.com");
        return new ApiInfo(
                "这是swagger的api文档",
                "自己测试端口",
                "1.0",
                "https://github.com/tangshiyi341914/project",
                contact,
                "Apache 2.0",
                "许可证链接",
                new ArrayList());
    }
}
