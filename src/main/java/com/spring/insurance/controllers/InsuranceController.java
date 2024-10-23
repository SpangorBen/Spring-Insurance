package com.spring.insurance.controllers;

import com.spring.insurance.services.interfaces.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.logging.Logger;

@Controller("/insurance")
public class InsuranceController {
    private Logger logger = Logger.getLogger(InsuranceController.class.getName());

    @Autowired
    private InsuranceService insuranceService;





}
