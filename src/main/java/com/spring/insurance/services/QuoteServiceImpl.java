package com.spring.insurance.services;

import com.spring.insurance.models.AutoInsurancePolicy;
import com.spring.insurance.models.HealthInsurancePolicy;
import com.spring.insurance.models.HomeInsurancePolicy;
import com.spring.insurance.models.Quote;
import com.spring.insurance.models.enums.InsuranceType;
import com.spring.insurance.repositories.interfaces.QuoteRepository;
import com.spring.insurance.services.interfaces.QuoteService;
import com.spring.insurance.utils.QuoteCalculatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
public class QuoteServiceImpl implements QuoteService {

    private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class); // Use SLF4J

    @Autowired
    private QuoteRepository quoteRepository;

    @Override
    public Quote calculateAutoQuote(AutoInsurancePolicy autoInsurancePolicy) {
        try {
            double quoteAmount = QuoteCalculatorUtil.calculateAutoQuote(autoInsurancePolicy);
            Quote quote = new Quote(InsuranceType.AUTO, autoInsurancePolicy, quoteAmount, LocalDate.now());
            logger.info("Calculated auto insurance quote: {}", quote);
            return quote;
        } catch (Exception e) {
            logger.error("Error calculating auto insurance quote", e);
            throw new RuntimeException("Error calculating auto insurance quote", e);
        }
    }

    @Override
    public Quote calculateHomeQuote(HomeInsurancePolicy homeInsurancePolicy) {
        try {
            double quoteAmount = QuoteCalculatorUtil.calculateHomeQuote(homeInsurancePolicy);
            Quote quote = new Quote(InsuranceType.HOME, homeInsurancePolicy, quoteAmount, LocalDate.now());
            logger.info("Calculated home insurance quote: {}", quote);
            return quote;
        } catch (Exception e) {
            logger.error("Error calculating home insurance quote", e);
            throw new RuntimeException("Error calculating home insurance quote", e);
        }
    }

    @Override
    public Quote calculateHealthQuote(HealthInsurancePolicy healthInsurancePolicy) {
        try {
            double quoteAmount = QuoteCalculatorUtil.calculateHealthQuote(healthInsurancePolicy);
            Quote quote = new Quote(InsuranceType.HEALTH, healthInsurancePolicy, quoteAmount, LocalDate.now());
            logger.info("Calculated health insurance quote: {}", quote);
            return quote;
        } catch (Exception e) {
            logger.error("Error calculating health insurance quote", e);
            throw new RuntimeException("Error calculating health insurance quote", e);
        }
    }

    @Override
    @Transactional
    public Quote saveQuote(Quote quote) {
        try {
            Quote savedQuote = quoteRepository.save(quote);
            logger.info("Saved quote: {}", savedQuote);
            return savedQuote;
        } catch (Exception e) {
            logger.error("Error saving quote", e);
            throw new RuntimeException("Error saving quote", e);
        }
    }

    @Override
    public Quote getQuoteById(Long id) {
        try {
            Quote quote = quoteRepository.findById(id).orElse(null);
            logger.info("Retrieved quote by id {}: {}", id, quote);
            return quote;
        } catch (Exception e) {
            logger.error("Error retrieving quote by id {}", id, e);
            throw new RuntimeException("Error retrieving quote by id " + id, e);
        }
    }
}