package com.ebsco.ebischoff.containerpractice.create;

import com.ebsco.ebischoff.containerpractice.models.Chicken;
import com.ebsco.ebischoff.containerpractice.models.Cow;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.PrintStream;

@Configuration
public class AnimalConfig {

    @Bean
    public Chicken chicken() {
        return new Chicken();
    }

    @Bean
    public Cow cow() {
        return new Cow();
    }
}
