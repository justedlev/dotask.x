package io.justedlev.dotaskx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DoTaskXApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoTaskXApplication.class, args);
	}

}
