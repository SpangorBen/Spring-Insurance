package com.spring.insurance.repositories;

import com.spring.insurance.models.HealthInsurancePolicy;
import com.spring.insurance.repositories.interfaces.InsuranceRepository;

public class HealthInsuranceRepositoryImpl extends GenericRepositoryImpl<HealthInsurancePolicy> implements InsuranceRepository<HealthInsurancePolicy> {

    public HealthInsuranceRepositoryImpl() {
        super(HealthInsurancePolicy.class);
    }
}