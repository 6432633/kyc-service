package io.kyc.kycservice.controllers;

import io.kyc.kycservice.dto.CustomerRequestDto;
import io.kyc.kycservice.entity.CustomerRequest;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRequestController {
    @PostMapping()
    ResponseEntity<CustomerRequestDto> createCustomerRequest(@RequestBody CustomerRequest customerRequest) {
        try {
            throw new ExecutionControl.NotImplementedException("");
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }
    }
}
