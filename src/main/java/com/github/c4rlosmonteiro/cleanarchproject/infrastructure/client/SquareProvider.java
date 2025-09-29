package com.github.c4rlosmonteiro.cleanarchproject.infrastructure.client;

import com.github.c4rlosmonteiro.cleanarchproject.infrastructure.client.requests.SquarePaymentRequest;
import com.github.c4rlosmonteiro.cleanarchproject.infrastructure.client.responses.SquarePaymentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "square-provider", url="http://localhost:8081/")
public interface SquareProvider {
    @PostMapping(consumes = "/pay")
    SquarePaymentResponse pay(final SquarePaymentRequest request);
}
