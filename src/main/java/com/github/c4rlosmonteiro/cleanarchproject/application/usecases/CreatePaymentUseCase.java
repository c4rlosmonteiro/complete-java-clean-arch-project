package com.github.c4rlosmonteiro.cleanarchproject.application.usecases;

import com.github.c4rlosmonteiro.cleanarchproject.domain.enums.Provider;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CreatePaymentUseCase {

    public Out execute(final BigDecimal amount, final Provider provider) {

    }

    public static class Out {
        public String id;
    }
}
