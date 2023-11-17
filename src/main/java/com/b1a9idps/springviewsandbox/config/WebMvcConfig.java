package com.b1a9idps.springviewsandbox.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration(proxyBeanMethods = false)
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // /indexにアクセスすると、index.htmlが表示される
        registry.addViewController("/").setViewName("index");
        // /sampleにアクセスすると、sample/sample.htmlが表示される
        registry.addViewController("/sample").setViewName("sample/sample");
    }
}
