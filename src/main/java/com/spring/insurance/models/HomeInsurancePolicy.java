package com.spring.insurance.models;

import com.spring.insurance.models.enums.InsuranceStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "home_insurance_policies")
public class HomeInsurancePolicy extends InsurancePolicy{

    private double propertyValue;
    private boolean securitySystem;

    public HomeInsurancePolicy() {
    }

    public HomeInsurancePolicy(String policyNumber, LocalDate effectiveDate, User user, String assetType, boolean riskFactor, double propertyValue, boolean securitySystem, InsuranceStatus status) {
        super(policyNumber, effectiveDate, user, assetType, riskFactor, status);
        this.propertyValue = propertyValue;
        this.securitySystem = securitySystem;
    }

    public double getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(double propertyValue) {
        this.propertyValue = propertyValue;
    }


    public boolean isSecuritySystem() {
        return securitySystem;
    }

    public void setSecuritySystem(boolean securitySystem) {
        this.securitySystem = securitySystem;
    }

    @Override
    public String toString() {
        return "HomeInsurancePolicy{" +
                "policyNumber='" + getPolicyNumber() + '\'' +
                ", assetType='" + getAssetType() + '\'' +
                ", riskFactor=" + isRiskFactor() +
                ", effectiveDate=" + getEffectiveDate() +
                ", propertyValue=" + propertyValue +
                ", securitySystem=" + securitySystem +
                '}';
    }
}
