package com.ibm.restaurant;

import com.ibm.restaurant.infrastructure.PersistenceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@ImportAutoConfiguration(PersistenceConfig.class)
@SpringBootApplication
public class RestaurantApplication {

    public static void main(String[] args) {
        //SpringApplication.run(RestaurantApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(DemoBeansConfig.class);
        Book book = context.getBean(Book.class);
        System.out.println("Author: " + book.getAuthor().getFirstName());
    }

}
