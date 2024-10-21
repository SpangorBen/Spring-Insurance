package com.spring.insurance.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "quotes")
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "policy_id")
    private InsurancePolicy InsurancePolicy;

    private double quoteAmount;
    private LocalDate quoteDate;
    private String insuranceType;

    public Quote() {
    }

    public Quote(User user, AutoInsurancePolicy InsurancePolicy, double quoteAmount, LocalDate quoteDate, String insuranceType) {
        this.user = user;
        this.InsurancePolicy = InsurancePolicy;
        this.quoteAmount = quoteAmount;
        this.quoteDate = quoteDate;
        this.insuranceType = insuranceType;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public InsurancePolicy getInsurancePolicy() {
        return InsurancePolicy;
    }

    public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
        InsurancePolicy = insurancePolicy;
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

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", user=" + user +
                ", InsurancePolicy=" + InsurancePolicy +
                ", quoteAmount=" + quoteAmount +
                ", quoteDate=" + quoteDate +
                ", insuranceType='" + insuranceType + '\'' +
                '}';
    }
}
