package com.spring.insurance.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "auto_insurance_policies")
public class AutoInsurancePolicy extends InsurancePolicy{

    private String vehicleMake;
    private String vehicleModel;
    private boolean noClaimsDiscount;

    public AutoInsurancePolicy() {
    }

    public AutoInsurancePolicy(String policyNumber, LocalDate effectiveDate, User user, String assetType, boolean riskFactor, String vehicleMake, String vehicleModel, boolean noClaimsDiscount) {
        super(policyNumber, effectiveDate, user, assetType, riskFactor);
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.noClaimsDiscount = noClaimsDiscount;
    }


    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public boolean isNoClaimsDiscount() {
        return noClaimsDiscount;
    }

    public void setNoClaimsDiscount(boolean noClaimsDiscount) {
        this.noClaimsDiscount = noClaimsDiscount;
    }

    @Override
    public String toString() {
        return "AutoInsurancePolicy{" +
                "policyNumber='" + getPolicyNumber() + '\'' +
                ", assetType='" + getAssetType() + '\'' +
                ", riskFactor=" + isRiskFactor() +
                ", effectiveDate=" + getEffectiveDate() +
                ", vehicleMake='" + vehicleMake + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", noClaimsDiscount=" + noClaimsDiscount +
                '}';
    }
}
