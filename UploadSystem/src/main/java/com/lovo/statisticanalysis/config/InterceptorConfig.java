package com.lovo.statisticanalysis.config;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.lovo.statisticanalysis.util.MyInterceptor;

@Component
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    //添加多个拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
    }

    /**
     * 放过静态资源
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");

       registry.addResourceHandler("/templates/**")
                .addResourceLocations("classpath:/templates/");
    }



}
