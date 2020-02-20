package com.lizhi.xingbao.filter;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aaron
 */
@Configuration
public class CorsConfig {

    @Bean
    public FilterRegistrationBean corsFilter(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();

        registrationBean.setFilter(new CorsFilter());
        registrationBean.setName("corsFilter");
        registrationBean.addUrlPatterns("/xingbao");
        registrationBean.setOrder(1);
        return registrationBean;
    }
}
