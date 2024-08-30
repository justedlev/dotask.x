package dev.justedlev.restjobx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RestJobXApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestJobXApplication.class, args);
	}

}
