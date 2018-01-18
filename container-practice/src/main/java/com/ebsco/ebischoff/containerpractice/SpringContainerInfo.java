package com.ebsco.ebischoff.containerpractice;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.io.PrintStream;
import java.util.Map;

public class SpringContainerInfo {

    private final ConfigurableApplicationContext context;

    public SpringContainerInfo(ConfigurableApplicationContext context) {
        this.context = context;
    }

    private void start(PrintStream out, String title) {
        out.println("\n------------------------------"+title.toUpperCase()+":\n");
    }

    private void end(PrintStream out) {

        out.println("------------------------------\n");
    }

    public void printAllInfo(PrintStream out) {
        // PRINT APPLICATION NAME
        start(out, "application name");
        out.println(context.getApplicationName());

        // PRINT ENVIRONMENT
        ConfigurableEnvironment config = context.getEnvironment();
        start(out, "spring config");
        out.println(config.toString());
        start(out, "environment");
        Map<String, Object> env = config.getSystemEnvironment();
        env.forEach( (String s, Object o) -> {
            out.println(s + ": " + o );
        });
        start(out, "properties");
        Map<String, Object> props = config.getSystemProperties();
        props.forEach( (String s, Object o) -> {
            out.println(s + ": \t\t" + o );
        });

        // PRINT BEANS
        start(out, "beans");
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            Object o = context.getBean(name);
            out.println("TYPE NAME: "+o.getClass().getName());
            out.println("FULL NAME: "+o.getClass().getCanonicalName());
            out.println("BEAN NAME: " + name);
            out.println();
        }

        // PRINT CUSTOM BEANS
        start(out, "custom beans");
        names = context.getBeanDefinitionNames();
        for (String name : names) {
            Object o = context.getBean(name);
            if (o.getClass().getName().startsWith("com.ebsco")) {
                out.println("TYPE NAME: " + o.getClass().getName());
                out.println("FULL NAME: " + o.getClass().getCanonicalName());
                out.println("BEAN NAME: " + name);
                out.println();
            }
        }

    }

}
