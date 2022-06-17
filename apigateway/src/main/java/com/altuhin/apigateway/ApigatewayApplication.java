package com.altuhin.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApigatewayApplication {

	//	@Autowired
//	private DiscoveryClient discoveryClient;
//
//	@Bean
//	public DiscoveryClientRouteDefinitionLocator discoveryClientRouteLocator(DiscoveryClient discoveryClient,
//																			 DiscoveryLocatorProperties properties) {
//		return new DiscoveryClientRouteDefinitionLocator(discoveryClient, properties);
//	}
	public static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication.class, args);
	}
//
//	@LoadBalanced
//	@Bean
//	RestTemplate restTemplate() {
//		return new RestTemplate();
//	}

}
