package com.ibm.restaurant;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@ImportAutoConfiguration(PersistenceConfig.class)
@SpringBootApplication
public class RestaurantApplication {

    public static void main(String[] args) {

        //SpringApplication.run(RestaurantApplication.class, args);
        //facem un context, obtinem obiecte din Application Context
        ApplicationContext context= new AnnotationConfigApplicationContext(DemoConfig.class); //ia bean-urile din DemoConfig

        //scoatem din context o carte
        book Book=context.getBean(book.class);//pe ce clasa vrem sa-l mapeze cand il aduce din context
        System.out.println("Author: "+Book.getAuthor().getName());
    }

}
