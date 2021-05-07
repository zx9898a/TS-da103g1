package com.vue.configure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@PropertySource(value="classpath:application.properties",encoding = "utf-8")
@Data
public class AppcationPropertiesConfig {
	@Value("${da103g1.datasource.driver-class-name}")
	private String da103g1DataSourceDriverClassname;
	
	@Value("${da103g1.dataSource.username}")
	private String da103g1DataSourceUsername;
	
	@Value("${da103g1.dataSource.password}")
    private String da103g1DataSourcePassword;
	
    @Value("${da103g1.dataSource.jdbcUrl}")
    private String da103g1DataSourceJdbcUrl;

}
