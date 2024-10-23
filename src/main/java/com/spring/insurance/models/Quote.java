package com.spring.insurance.models;

import com.spring.insurance.models.enums.InsuranceType;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "quotes")
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private InsuranceType insuranceType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "insurance_id")
    private InsurancePolicy insurance;

    private double quoteAmount;
    private LocalDate quoteDate;

    public Quote() {
    }

    public Quote(InsuranceType insuranceType, InsurancePolicy insurance, double quoteAmount, LocalDate quoteDate) {
        this.insuranceType = insuranceType;
        this.insurance = insurance;
        this.quoteAmount = quoteAmount;
        this.quoteDate = quoteDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InsuranceType getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(InsuranceType insuranceType) {
        this.insuranceType = insuranceType;
    }

    public InsurancePolicy getInsurance() {
        return insurance;
    }

    public void setInsurance(InsurancePolicy insurance) {
        this.insurance = insurance;
    }

    public double getQuoteAmount() {
        return quoteAmount;
    }

    public void setQuoteAmount(double quoteAmount) {
        this.quoteAmount = quoteAmount;
    }

    public LocalDate getQuoteDate() {
        return quoteDate;
    }

    public void setQuoteDate(LocalDate quoteDate) {
        this.quoteDate = quoteDate;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", insuranceType=" + insuranceType +
                ", insurance=" + insurance +
                ", quoteAmount=" + quoteAmount +
                ", quoteDate=" + quoteDate +
                '}';
    }
}
