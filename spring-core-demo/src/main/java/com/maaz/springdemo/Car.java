package com.maaz.springdemo;

/**
 * A concrete Vehicle. Spring creates and manages this object
 * because it is declared as a bean in spring.xml.
 */
public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving...");
    }
}
