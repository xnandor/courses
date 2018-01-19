package com.ebsco.ebischoff.containerpractice;

import com.ebsco.ebischoff.containerpractice.use.Farmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.io.PrintStream;

@SpringBootApplication
//@ImportResource("classpath:beans.xml")
public class ContainerApplication {

	public static ConfigurableApplicationContext springContext;
	static PrintStream out = System.out;

	public static void main(String[] args) {
		springContext = SpringApplication.run(ContainerApplication.class, args);
		SpringContainerInfo containerInfo = new SpringContainerInfo(springContext);
		containerInfo.printAllInfo(out);

		Farmer farmer = springContext.getBean("farmer", Farmer.class);
        farmer.farm(out);
	}
}
