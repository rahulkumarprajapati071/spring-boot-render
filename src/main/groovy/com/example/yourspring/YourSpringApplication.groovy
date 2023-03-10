package com.example.yourspring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(scanBasePackages = "com.example.yourspring")
class YourSpringApplication {

	static void main(String[] args) {
		SpringApplication.run(YourSpringApplication, args)
	}

}
