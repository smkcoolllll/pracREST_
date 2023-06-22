package com.rest.api.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@Configuration
public class GatewayRoutingConfig {
	
	@Bean
	public RouteLocator configureRoute(RouteLocatorBuilder builder)
	{
		
//	Static Route
		return builder.routes()
				.route("prodservice", r -> r.path("/product/**").uri("http://localhost:8082"))
				.route("storeservice", r -> r.path("/api/store/**").uri("http://localhost:8080"))
				.build();
	}

}
