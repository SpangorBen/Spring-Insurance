package com.spring.insurance.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "health_insurance_policies")
public class HealthInsurancePolicy extends InsurancePolicy{


    public HealthInsurancePolicy() {
    }

    public HealthInsurancePolicy(String policyNumber, LocalDate effectiveDate, User user, String assetType, boolean riskFactor) {
        super(policyNumber, effectiveDate, user, assetType, riskFactor);
    }

    @Override
    public String toString() {
        return "HealthInsurancePolicy{" +
                "policyNumber='" + getPolicyNumber() + '\'' +
                ", assetType='" + getAssetType() + '\'' +
                ", riskFactor=" + isRiskFactor() +
                ", effectiveDate=" + getEffectiveDate() +
                '}';
    }
}
