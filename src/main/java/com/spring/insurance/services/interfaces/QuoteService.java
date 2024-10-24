package com.spring.insurance.services.interfaces;

import com.spring.insurance.models.AutoInsurancePolicy;
import com.spring.insurance.models.HealthInsurancePolicy;
import com.spring.insurance.models.HomeInsurancePolicy;
import com.spring.insurance.models.Quote;

public interface QuoteService {
    Quote calculateAutoQuote(AutoInsurancePolicy autoInsurancePolicy);
    Quote calculateHomeQuote(HomeInsurancePolicy homeInsurancePolicy);
    Quote calculateHealthQuote(HealthInsurancePolicy healthInsurancePolicy);
    Quote saveQuote(Quote quote);
    Quote getQuoteById(Long id);
}
