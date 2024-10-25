package com.spring.insurance.repositories.interfaces;

import com.spring.insurance.models.Quote;
import com.spring.insurance.models.User;

import java.util.List;

public interface QuoteRepository extends GenericRepository<Quote> {
    List<Quote> findQuotesByUser(User user);
}
