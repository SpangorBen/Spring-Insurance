package com.spring.insurance.repositories;

import com.spring.insurance.models.HomeInsurancePolicy;
import com.spring.insurance.repositories.interfaces.InsuranceRepository;

public class HomeInsuranceRepositoryImpl extends GenericRepositoryImpl<HomeInsurancePolicy> implements InsuranceRepository<HomeInsurancePolicy> {

    public HomeInsuranceRepositoryImpl() {
        super(HomeInsurancePolicy.class);
    }
}
