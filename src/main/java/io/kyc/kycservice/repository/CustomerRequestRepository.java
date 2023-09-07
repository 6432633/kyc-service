package io.kyc.kycservice.repository;

import io.kyc.kycservice.dto.CustomerRequestDto;
import io.kyc.kycservice.entity.CustomerRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRequestRepository extends JpaRepository<CustomerRequest, Long> {
    CustomerRequestDto createCustomerRequest(CustomerRequest customerRequest);
    CustomerRequestDto updateCustomerRequest(CustomerRequest customerRequest);

}
