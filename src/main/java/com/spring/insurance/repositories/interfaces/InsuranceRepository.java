package com.spring.insurance.repositories.interfaces;

import com.spring.insurance.models.InsurancePolicy;

public interface InsuranceRepository<T extends InsurancePolicy> extends GenericRepository<T> {

}
