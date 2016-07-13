package smoh.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
//@ComponentScan("smoh.jpa.controller")
@ComponentScan
public class Applcation {
	public static void main(String[] args) {
		SpringApplication.run(Applcation.class, args);
	}
}
