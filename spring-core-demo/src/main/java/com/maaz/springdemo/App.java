package com.maaz.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry point. Loads the Spring container from spring.xml,
 * asks it for the "vehicle" bean and calls drive().
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Vehicle obj = (Vehicle) context.getBean("vehicle");
        obj.drive();
    }
}
