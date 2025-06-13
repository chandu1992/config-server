package com.jarvis.config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
//	System.out.Print("this is config server")
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
