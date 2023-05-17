package com.hnc.nbaver.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.hnc.nbaver.model.dao")
public class DBConfig {

}
