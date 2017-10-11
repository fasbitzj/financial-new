package com.ucl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by jiang.zheng on 2017/9/5.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class BootApplication {

    private static final Logger logger = LogManager.getLogger(BootApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            logger.info("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }

    /*@Bean
    public Converter<String, Date> dateTimeConvert() {
        return new Converter<String, Date>() {
            @Override
            public Date convert(String dateTime) {
                try {
                    LocalDateTime localDateTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    Date out = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
                    return out;
                } catch (Exception e) {
                    logger.error(e.getMessage(), e);
                }
                return null;
            }
        };
    }*/
}
