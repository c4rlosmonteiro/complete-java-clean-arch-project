package com.github.c4rlosmonteiro.cleanarchproject.application.interfaces;

import com.github.c4rlosmonteiro.cleanarchproject.infrastructure.client.requests.SquarePaymentRequest;
import com.github.c4rlosmonteiro.cleanarchproject.infrastructure.client.responses.SquarePaymentResponse;

public interface SquareProviderAdapter {
    SquarePaymentResponse pay(final SquarePaymentRequest request);
}
