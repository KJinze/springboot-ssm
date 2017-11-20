package cn.itcast.springboot.datasource;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 配置C3p0连接池的属性
 *
 */
@Configuration
public class DataSourceConfigure {
	
	@Bean(name="dataSource")
	@Primary //首选注入
	@ConfigurationProperties(prefix="spring.datasource.c3p0")//模仿自动配置类注解
	public DataSource createDataSource(){
		return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
	}
}
