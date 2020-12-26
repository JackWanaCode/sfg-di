package com.spring5.sfgdi.controllers;

import com.spring5.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

}