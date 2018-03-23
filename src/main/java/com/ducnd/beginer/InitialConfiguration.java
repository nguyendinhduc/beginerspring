//package com.ducnd.beginer;
//
//import org.jooq.SQLDialect;
//import org.jooq.conf.Settings;
//import org.jooq.impl.DataSourceConnectionProvider;
//import org.jooq.impl.DefaultConfiguration;
//import org.jooq.impl.DefaultDSLContext;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class InitialConfiguration {
//    private Environment environment;
//
//    @Autowired
//    InitialConfiguration(Environment environment) {
//        this.environment = environment;
//    }
//
//    @Bean(name = "dataSource")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create()
//                .driverClassName(environment.getProperty("spring.datasource.driverClassName"))
//                .url(environment.getProperty("spring.datasource.url"))
//                .username(environment.getProperty("spring.datasource.username"))
//                .password(environment.getProperty("spring.datasource.password"))
//                .build();
//    }
//
//    @Bean
//    public DataSourceConnectionProvider connectionProvider() {
//        return new DataSourceConnectionProvider(new TransactionAwareDataSourceProxy(dataSource()));
//    }
//
//    @Bean(name = "dslContext")
//    public DefaultDSLContext dsl() {
//        return new DefaultDSLContext(configuration());
//    }
//
//    @Bean
//    public DefaultConfiguration configuration() {
//        DefaultConfiguration jooqConfiguration = new DefaultConfiguration();
//        jooqConfiguration.set(connectionProvider());
//        jooqConfiguration.setSQLDialect(SQLDialect.MYSQL);
//        Settings settings = new Settings();
//        settings.setRenderSchema(Boolean.FALSE);
//        settings.setRenderCatalog(Boolean.FALSE);
//        jooqConfiguration.setSettings(settings);
//        return jooqConfiguration;
//    }
//
//
//    @Bean
//    public DataSourceTransactionManager transactionManager() {
//        return new DataSourceTransactionManager(dataSource());
//    }
//}
