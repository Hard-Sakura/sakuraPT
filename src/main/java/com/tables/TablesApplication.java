package com.tables;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(value = "com.tables.dao")
@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class, GsonAutoConfiguration.class,ActiveMQAutoConfiguration.class})
@EnableTransactionManagement
public class TablesApplication {

    public static void main(String[] args) {
        SpringApplication.run(TablesApplication.class, args);
    }

}
