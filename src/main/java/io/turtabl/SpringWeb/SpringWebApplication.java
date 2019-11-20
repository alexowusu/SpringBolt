package io.turtabl.SpringWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) { SpringApplication.run(SpringWebApplication.class, args);
	}
@Bean
public Maths plus(){
		return new Maths();
}
}
