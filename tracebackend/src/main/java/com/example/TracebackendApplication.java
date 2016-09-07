package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class TracebackendApplication {

	private static final Logger LOG = Logger.getLogger(TracebackendApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(TracebackendApplication.class, args);
	}

    @RequestMapping("/")
    public String home(){
        LOG.log(Level.INFO, "trace demo backend is being called");
        return "Hello World.";
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
