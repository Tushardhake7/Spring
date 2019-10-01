
  package com.example.boot;
  
  import org.springframework.boot.SpringApplication; import
  org.springframework.boot.autoconfigure.SpringBootApplication; import
  org.springframework.context.annotation.ComponentScan;
  
  @ComponentScan("com.example.*")
  @SpringBootApplication 
  public class ExampleOfSpringbootApplication {
  
  public static void main(String[] args) {
  SpringApplication.run(ExampleOfSpringbootApplication.class, args); }
  
  }
  
  
 