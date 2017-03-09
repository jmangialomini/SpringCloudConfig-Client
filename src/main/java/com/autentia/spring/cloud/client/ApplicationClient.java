package com.autentia.spring.cloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
public class ApplicationClient {

  @Value("${service.name}")
  String name = null;

  @RequestMapping("/")
  public String home() {
	  
	  String result;
	  if(!name.equals(null)){		  
		  result = "Service - " + name + ": OK";
	  }else {
		  result = "Service: KO";
	  }	  
    return result;
  }

  public static void main(String[] args) {
    SpringApplication.run(ApplicationClient.class, args);
  }
 
}
