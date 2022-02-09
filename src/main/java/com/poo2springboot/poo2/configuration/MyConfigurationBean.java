package com.poo2springboot.poo2.configuration;

import com.poo2springboot.poo2.bean.MyBean;
import com.poo2springboot.poo2.bean.MyBeanImplements;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImplements();
    }
}
