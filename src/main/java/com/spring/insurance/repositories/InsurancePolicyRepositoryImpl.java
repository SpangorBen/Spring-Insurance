package com.spring.insurance.repositories;

import com.spring.insurance.models.InsurancePolicy;
import com.spring.insurance.repositories.interfaces.InsurancePolicyRepository;
import org.springframework.stereotype.Repository;

@Repository
public class InsurancePolicyRepositoryImpl extends GenericRepositoryImpl<InsurancePolicy> implements InsurancePolicyRepository {

    public InsurancePolicyRepositoryImpl() {
        super(InsurancePolicy.class);
    }
}
