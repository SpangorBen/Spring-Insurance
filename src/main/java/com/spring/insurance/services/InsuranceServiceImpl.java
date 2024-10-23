package com.spring.insurance.services;

import com.spring.insurance.models.AutoInsurancePolicy;
import com.spring.insurance.models.HealthInsurancePolicy;
import com.spring.insurance.models.HomeInsurancePolicy;
import com.spring.insurance.repositories.interfaces.InsuranceRepository;
import com.spring.insurance.services.interfaces.InsuranceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InsuranceServiceImpl implements InsuranceService {

    private static final Logger logger = LoggerFactory.getLogger(InsuranceServiceImpl.class);

    @Autowired
    private InsuranceRepository<AutoInsurancePolicy> autoInsuranceRepository;

    @Autowired
    private InsuranceRepository<HealthInsurancePolicy> healthInsuranceRepository;

    @Autowired
    private InsuranceRepository<HomeInsurancePolicy> homeInsuranceRepository;

    @Override
    @Transactional
    public AutoInsurancePolicy createAutoInsurancePolicy(AutoInsurancePolicy autoInsurancePolicy) {
        try {
            autoInsurancePolicy = autoInsuranceRepository.save(autoInsurancePolicy);
            logger.info("Created AutoInsurancePolicy: {}", autoInsurancePolicy);
            return autoInsurancePolicy;
        } catch (Exception e) {
            logger.error("Error creating AutoInsurancePolicy", e);
            throw new RuntimeException("Error creating auto insurance policy", e);
        }
    }

    @Override
    @Transactional
    public HomeInsurancePolicy createHomeInsurancePolicy(HomeInsurancePolicy homeInsurancePolicy) {
        try {
            homeInsurancePolicy = homeInsuranceRepository.save(homeInsurancePolicy);
            logger.info("Created HomeInsurancePolicy: {}", homeInsurancePolicy);
            return homeInsurancePolicy;
        } catch (Exception e) {
            logger.error("Error creating HomeInsurancePolicy", e);
            throw new RuntimeException("Error creating home insurance policy", e);
        }
    }

    @Override
    @Transactional
    public HealthInsurancePolicy createHealthInsurancePolicy(HealthInsurancePolicy healthInsurancePolicy) {
        try {
            healthInsurancePolicy = healthInsuranceRepository.save(healthInsurancePolicy);
            logger.info("Created HealthInsurancePolicy: {}", healthInsurancePolicy);
            return healthInsurancePolicy;
        } catch (Exception e) {
            logger.error("Error creating HealthInsurancePolicy", e);
            throw new RuntimeException("Error creating health insurance policy", e);
        }
    }
}