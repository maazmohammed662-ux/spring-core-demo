package com.maaz.springdemo;

/**
 * Contract for anything that can be driven.
 * The application depends on this interface, not on a concrete class.
 */
public interface Vehicle {
    void drive();
}
