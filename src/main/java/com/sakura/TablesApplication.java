package com.sakura;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(value = "com.sakura.tables.dao")
@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class, GsonAutoConfiguration.class,ActiveMQAutoConfiguration.class})
@EnableTransactionManagement
@EnableFeignClients
@EnableScheduling
public class TablesApplication {

    public static void main(String[] args) {
        SpringApplication.run(TablesApplication.class, args);
    }

}
