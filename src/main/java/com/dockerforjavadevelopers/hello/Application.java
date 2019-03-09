package com.dockerforjavadevelopers.hello;


import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
    
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        
        try {

 			Class.forName("org.postgresql.Driver");

 			System.out.println("JDBC Class found");

// 			String hostname = "jdbc:postgresql://5a3ec84c-0eb5-49ba-899d-91a9339f02a9.d7deeff0d58745aba57fa5c84685d5b4.databases.appdomain.cloud:32203/ibmclouddb";

// 			String hostname = "url jdbc:postgresql://5a3ec84c-0eb5-49ba-899d-91a9339f02a9.d7deeff0d58745aba57fa5c84685d5b4.databases.appdomain.cloud:32203/ibmclouddb&sslmode=disable";

 			String hostname = "url jdbc:postgresql://5a3ec84c-0eb5-49ba-899d-91a9339f02a9.d7deeff0d58745aba57fa5c84685d5b4.databases.appdomain.cloud:32203/ibmclouddb&sslmode=verify-ca";
 			
 			System.out.println(hostname);
 			Connection con = DriverManager.getConnection(hostname, "ibm_cloud_9b4b8a88_9f9b_4687_a36d_9099038efbae",
 					"dae62724fbf067a147103b334b361e6323e006aa75f3647efaed1660314d5ae6");

 			System.out.println(con);
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
        
    }

}
