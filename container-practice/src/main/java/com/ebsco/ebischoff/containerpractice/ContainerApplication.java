package com.ebsco.ebischoff.containerpractice;

import com.ebsco.ebischoff.containerpractice.use.Farmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.PrintStream;

@SpringBootApplication
public class ContainerApplication {

	static PrintStream out = System.out;

	public static void main(String[] args) {
		ConfigurableApplicationContext springContext = SpringApplication.run(ContainerApplication.class, args);
		SpringContainerInfo containerInfo = new SpringContainerInfo(springContext);
		containerInfo.printAllInfo(out);

		Farmer farmer = springContext.getBean("farmer", Farmer.class);
        farmer.farm(out);
	}
}
