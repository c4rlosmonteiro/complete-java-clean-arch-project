package com.github.c4rlosmonteiro.cleanarchproject.infrastructure.config.feign;

import feign.okhttp.OkHttpClient;
import org.springframework.context.annotation.Bean;

public final class ClientConfiguration {
    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }
}
