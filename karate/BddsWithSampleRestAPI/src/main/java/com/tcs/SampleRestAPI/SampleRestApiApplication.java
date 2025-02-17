package com.tcs.SampleRestAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SampleRestApiApplication {

	@Autowired
	Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(SampleRestApiApplication.class, args);

	}

	@PostConstruct
	public void init(){
		System.out.println(" postconstruct methods--pass is "+environment.getProperty("vcap.dbpass"));
	}
}
