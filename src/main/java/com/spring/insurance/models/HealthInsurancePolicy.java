package com.spring.insurance.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "health_insurance_policies")
public class HealthInsurancePolicy extends InsurancePolicy{

    private String coverageType;  // (basic, premium)
    private String medicalHistory; // (or a more structured representation)

    public HealthInsurancePolicy() {
    }

    public HealthInsurancePolicy(String policyNumber, LocalDate effectiveDate, User user, String coverageType, String medicalHistory) {
        super(policyNumber, effectiveDate, user);
        this.coverageType = coverageType;
        this.medicalHistory = medicalHistory;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    @Override
    public String toString() {
        return "HealthInsurancePolicy{" +
                "coverageType='" + coverageType + '\'' +
                ", medicalHistory='" + medicalHistory + '\'' +
                '}';
    }
}
