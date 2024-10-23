package com.spring.insurance.utils;

import com.spring.insurance.models.AutoInsurancePolicy;
import com.spring.insurance.models.HealthInsurancePolicy;
import com.spring.insurance.models.HomeInsurancePolicy;

import java.time.LocalDate;
import java.time.Period;

public class QuoteCalculatorUtil {

    public static double calculateAutoQuote(AutoInsurancePolicy autoPolicy) {
        double basePrice = 500;

        int driverAge = Period.between(autoPolicy.getUser().getBirthDate(), LocalDate.now()).getYears();

        if (driverAge < 25) {
            basePrice *= 1.10;
        }

        if (autoPolicy.getAssetType().equalsIgnoreCase("luxury")) {
            basePrice *= 1.15; // +15% for luxury vehicles
        }

        if (autoPolicy.isRiskFactor()) {
            basePrice *= 1.10; // +10% for professional use
        }

        if (autoPolicy.isNoClaimsDiscount()) {
            basePrice *= 0.80; // -20% for no claims in 3 years
        } else {
            basePrice *= 1.10; // +10% if claims in the last 3 years
        }

        return basePrice;
    }

    public static double calculateHomeQuote(HomeInsurancePolicy homePolicy) {
        double basePrice = 300;

        if (homePolicy.getAssetType().equalsIgnoreCase("house")) {
            basePrice *= 1.02; // +2% if it's a house
        }

        if (homePolicy.isRiskFactor()) {
            basePrice *= 1.05; // +5% for a high-risk location
        }

        if (homePolicy.getPropertyValue() > 200000) {
            basePrice *= 1.10;
        }

        if (homePolicy.isSecuritySystem()) {
            basePrice *= 0.85; // -15% if a security system is present
        } else {
            basePrice *= 1.15; // +15% if no security system
        }

        return basePrice;
    }

    public static double calculateHealthQuote(HealthInsurancePolicy healthPolicy) {
        double basePrice = 150;

        int age = Period.between(healthPolicy.getUser().getBirthDate(), LocalDate.now()).getYears();

        if (age > 60) {
            basePrice *= 1.20; // +20% for people over 60
        }

        if (healthPolicy.isRiskFactor()) {
            basePrice *= 1.30; // +30% for pre-existing chronic conditions
        }

        if (healthPolicy.getAssetType().equalsIgnoreCase("basic")) {
            basePrice *= 0.90; // -10% for basic coverage
        } else if (healthPolicy.getAssetType().equalsIgnoreCase("premium")) {
            basePrice *= 1.05; // +5% for premium coverage
        }

        return basePrice;
    }
}
