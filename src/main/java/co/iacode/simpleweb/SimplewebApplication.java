package co.iacode.simpleweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@SpringBootApplication
@EnableAutoConfiguration 
@EnableScheduling
public class SimplewebApplication {
	public static void main(String[] args) {
		SpringApplication.run(SimplewebApplication.class, args);
	}
}
