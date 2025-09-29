package com.github.c4rlosmonteiro.cleanarchproject.application.services;

import com.github.c4rlosmonteiro.cleanarchproject.domain.enums.Provider;
import org.springframework.stereotype.Component;

@Component
public final class CreatePaymentStrategyFactory {

    public CreatePaymentStrategy select(final Provider provider) {
        if (Provider.SQUARE.equals(provider)) {
            return null;
        } else {
            throw new RuntimeException("Not implement yet!");
        }
    }
}
