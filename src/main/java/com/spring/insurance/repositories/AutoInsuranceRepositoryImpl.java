package com.spring.insurance.repositories;

import com.spring.insurance.models.AutoInsurancePolicy;
import com.spring.insurance.repositories.interfaces.InsuranceRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AutoInsuranceRepositoryImpl extends GenericRepositoryImpl<AutoInsurancePolicy> implements InsuranceRepository<AutoInsurancePolicy> {

    public AutoInsuranceRepositoryImpl() {
        super(AutoInsurancePolicy.class);
    }
}
