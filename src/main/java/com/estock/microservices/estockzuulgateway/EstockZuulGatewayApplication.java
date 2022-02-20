package com.estock.microservices.estockzuulgateway;

import com.estock.microservices.estockzuulgateway.filters.ErrorFilter;
import com.estock.microservices.estockzuulgateway.filters.PostFilter;
import com.estock.microservices.estockzuulgateway.filters.PreFilter;
import com.estock.microservices.estockzuulgateway.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class EstockZuulGatewayApplication {


    public static void main(String[] args) {
        SpringApplication.run(EstockZuulGatewayApplication.class, args);
    }
    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
}
