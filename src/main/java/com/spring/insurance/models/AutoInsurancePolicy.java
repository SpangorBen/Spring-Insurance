package com.spring.insurance.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "auto_insurance_policies")
public class AutoInsurancePolicy extends InsurancePolicy{

    private String vehicleMake;
    private String vehicleModel;
    private String vehicleType;
    private String vehicleUsage;
    private boolean noClaimsDiscount; // True if no claims in 3 years

    public AutoInsurancePolicy() {
    }

    public AutoInsurancePolicy(String policyNumber, LocalDate effectiveDate, User user, String vehicleMake, String vehicleModel, String vehicleType, String vehicleUsage, boolean noClaimsDiscount) {
        super(policyNumber, effectiveDate, user);
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleType = vehicleType;
        this.vehicleUsage = vehicleUsage;
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

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleUsage() {
        return vehicleUsage;
    }

    public void setVehicleUsage(String vehicleUsage) {
        this.vehicleUsage = vehicleUsage;
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
                "vehicleMake='" + vehicleMake + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehicleUsage='" + vehicleUsage + '\'' +
                ", noClaimsDiscount=" + noClaimsDiscount +
                '}';
    }
}
