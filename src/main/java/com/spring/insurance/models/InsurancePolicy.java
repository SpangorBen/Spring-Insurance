package com.spring.insurance.models;

import com.spring.insurance.models.enums.InsuranceStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "insurance_policies")
public abstract class InsurancePolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String policyNumber;
    private String assetType;
    private boolean riskFactor;

    @Enumerated(EnumType.STRING)
    private InsuranceStatus status;

    private LocalDate effectiveDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public InsurancePolicy() {
    }

    public InsurancePolicy(String policyNumber, LocalDate effectiveDate, User user, String assetType, boolean riskFactor) {
        this.policyNumber = policyNumber;
        this.effectiveDate = effectiveDate;
        this.user = user;
        this.assetType = assetType;
        this.riskFactor = riskFactor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public boolean isRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(boolean riskFactor) {
        this.riskFactor = riskFactor;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "id=" + id +
                ", policyNumber='" + policyNumber + '\'' +
                ", effectiveDate=" + effectiveDate +
                ", user=" + user +
                '}';
    }
}
