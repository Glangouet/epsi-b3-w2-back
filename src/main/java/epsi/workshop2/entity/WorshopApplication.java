/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author rfera
 */
@SpringBootApplication
public class WorshopApplication {

    @SuppressWarnings("unused")
    private static final Logger LOGGER = LoggerFactory.getLogger(WorshopApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WorshopApplication.class, args);
    }
}
