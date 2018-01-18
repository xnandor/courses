package com.ebsco.ebischoff.containerpractice.create;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.PrintStream;

@Configuration
public class LogConfig {

    @Bean
    public PrintStream printStream() {
        return System.out;
    }

}
