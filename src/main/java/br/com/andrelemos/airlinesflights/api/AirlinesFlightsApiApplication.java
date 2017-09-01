package br.com.andrelemos.airlinesflights.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.com.andrelemos.airlinesflights.api.config.AirlinesFlightsApiProperties;

@SpringBootApplication
//@EnableConfigurationProperties(AirlinesFlightsApiProperties.class)
public class AirlinesFlightsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlinesFlightsApiApplication.class, args);
	}
}
