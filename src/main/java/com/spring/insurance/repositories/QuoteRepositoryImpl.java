package com.spring.insurance.repositories;

import com.spring.insurance.models.Quote;
import com.spring.insurance.repositories.interfaces.QuoteRepository;
import org.springframework.stereotype.Repository;

@Repository
public class QuoteRepositoryImpl extends GenericRepositoryImpl<Quote> implements QuoteRepository {

    public QuoteRepositoryImpl() {
        super(Quote.class);
    }
}
