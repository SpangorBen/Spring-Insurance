package com.spring.insurance.services.interfaces;

import com.spring.insurance.models.AutoInsurancePolicy;
import com.spring.insurance.models.HealthInsurancePolicy;
import com.spring.insurance.models.HomeInsurancePolicy;

public interface InsuranceService {
    AutoInsurancePolicy createAutoInsurancePolicy(AutoInsurancePolicy autoInsurancePolicy);
    HomeInsurancePolicy createHomeInsurancePolicy(HomeInsurancePolicy homeInsurancePolicy);
    HealthInsurancePolicy createHealthInsurancePolicy(HealthInsurancePolicy healthInsurancePolicy);
}
