package com.mrgb.edgeservice.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Mono;

@Configuration
public class RateLimiterConfig {

  @Bean
  KeyResolver keyResolver() {
    return exchange -> Mono.just("anonymous");
  }
}
