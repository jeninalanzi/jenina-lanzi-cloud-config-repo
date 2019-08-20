package com.trilogyed.jeninalanzicloudconfigrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class JeninaLanziCloudConfigRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JeninaLanziCloudConfigRepoApplication.class, args);
	}

}
