package com.example.stringassign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import dependencies 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication

@RestController
public class StringassignApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringassignApplication.class, args);
	}
    // Annotation
    @RequestMapping("/")
    // Method that maps to the request route above
    public String greet() { // 3
            return "Hello client! How are you doing?";
    }
    @RequestMapping("/random")
    // Method that maps to the request route above
    public String randomGreet() { // 3
            return "SpringBoot is great! so easy to just respond with strings.";
    }
}
