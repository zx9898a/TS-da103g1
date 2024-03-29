package com.vue.configure;

import static java.util.Collections.singletonMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(entityManagerFactoryRef = "ds1EntityManagerFactory", transactionManagerRef = "ds1TransactionManager", basePackages = {
		"com.vue.esb.jpa.repository", "com.vue.esb.entity" })
@EnableTransactionManagement
public class JPAManagerFactory {

	@Bean
	@Primary
	public LocalContainerEntityManagerFactoryBean ds1EntityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("ds1") DataSource dataSource) {
		return builder.dataSource(dataSource).packages(packagesToScan()).persistenceUnit("ds1-pool")
				// very important not delete below
				.properties(singletonMap("hibernate.hbm2ddl.auto", "none")).build();
	}

	@Bean
	@Primary
	public PlatformTransactionManager ds1TransactionManager(
			@Qualifier("ds1EntityManagerFactory") EntityManagerFactory ds1EntityManagerFactory) {
		return new JpaTransactionManager(ds1EntityManagerFactory);
	}

	protected String[] packagesToScan() {
		return new String[] { "com.vue.esb.jpa.repository", "com.vue.esb.entity" };
	}

}
