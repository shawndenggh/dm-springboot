package com.dm.dmspringboot;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusPropertiesCustomizer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@MapperScan("com.dm.dmspringboot")
public class MybatisConfig {

    @Bean
    MybatisPlusPropertiesCustomizer mybatisPlusPropertiesCustomizer() {
        return properties -> {
            properties.setCheckConfigLocation(true);
            properties.setMapperLocations(new String[]{"classpath*:mapper/*.xml"});
        };
    }
}
