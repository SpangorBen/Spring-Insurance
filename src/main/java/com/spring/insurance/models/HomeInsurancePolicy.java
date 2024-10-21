package com.spring.insurance.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "home_insurance_policies")
public class HomeInsurancePolicy extends InsurancePolicy{

    private String propertyType; // (apartment, house, etc.)
    private double propertyValue;
    private String location;  // (or a separate Location entity for risk zones)
    private boolean securitySystem;  // True if security system present

    public HomeInsurancePolicy() {
    }

    public HomeInsurancePolicy(String policyNumber, LocalDate effectiveDate, User user, String propertyType, double propertyValue, String location, boolean securitySystem) {
        super(policyNumber, effectiveDate, user);
        this.propertyType = propertyType;
        this.propertyValue = propertyValue;
        this.location = location;
        this.securitySystem = securitySystem;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public double getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(double propertyValue) {
        this.propertyValue = propertyValue;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
                "propertyType='" + propertyType + '\'' +
                ", propertyValue=" + propertyValue +
                ", location='" + location + '\'' +
                ", securitySystem=" + securitySystem +
                '}';
    }
}
