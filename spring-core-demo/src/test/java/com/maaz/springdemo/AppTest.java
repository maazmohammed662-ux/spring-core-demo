package com.maaz.springdemo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class AppTest {

    @Test
    void vehicleBeanIsLoadedFromSpringContainer() {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml")) {
            Vehicle vehicle = context.getBean("vehicle", Vehicle.class);

            assertNotNull(vehicle);
            assertTrue(vehicle instanceof Car);
        }
    }
}
