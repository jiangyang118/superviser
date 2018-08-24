package com.sunego.commerce.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan(basePackages = { "com.sunego.commerce.web" })
@EnableWebMvc
public class SwaggerConfig extends WebMvcConfigurationSupport {

    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("jackial", "https://github.com/jiangyang118/superviser", "jiangyang@sunnybs.com");
        return new ApiInfo("监管平台API接口", // 大标题 title
                "小程序端接口", // 小标题
                "1.0", // 版本
                "https://www.esunego.com", // termsOfServiceUrl
                contact, // 作者
                "github-superviser", // 链接显示文字
                "https://github.com/jiangyang118/superviser"// 网站链接
        );
    }

}