package com.mengxuegu.springcloud.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 *刷新数据源
 */
//一定不要在此类加@RefreshScope，不然报错
@Configuration
public class DruidConfig {

    @RefreshScope//刷新数据源
    @ConfigurationProperties(prefix = "spring.dataSource")//绑定数据源
    public DataSource druid(){
        return new DruidDataSource();
    }
}
