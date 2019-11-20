package io.turtabl.SpringWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) { SpringApplication.run(SpringWebApplication.class, args);
	}
@Bean
public Maths plus(){
		return new Maths();
}
}
