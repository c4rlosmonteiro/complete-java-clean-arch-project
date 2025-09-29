package com.github.c4rlosmonteiro.cleanarchproject.domain.entities;

import com.github.c4rlosmonteiro.cleanarchproject.domain.enums.Provider;

public class Payment {
    private String id;
    private String amount;
    private Provider provider;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(final String amount) {
        this.amount = amount;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(final Provider provider) {
        this.provider = provider;
    }
}
