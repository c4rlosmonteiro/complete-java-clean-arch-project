package com.github.c4rlosmonteiro.cleanarchproject.infrastructure.client.requests;

import java.math.BigDecimal;

public final class SquarePaymentRequest {
    public BigDecimal amount;
    public String reference;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(final BigDecimal amount) {
        this.amount = amount;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(final String reference) {
        this.reference = reference;
    }
}
