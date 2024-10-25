package com.spring.insurance.services.interfaces;

import com.spring.insurance.models.*;

import java.util.List;

public interface QuoteService {
    Quote calculateAutoQuote(AutoInsurancePolicy autoInsurancePolicy);
    Quote calculateHomeQuote(HomeInsurancePolicy homeInsurancePolicy);
    Quote calculateHealthQuote(HealthInsurancePolicy healthInsurancePolicy);
    Quote saveQuote(Quote quote);

    Quote updateQuote(Quote quote);

    Quote getQuoteById(Long id);

    List<Quote> getQuotesByUser(User loggedInUser);
}
