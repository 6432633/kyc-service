package io.kyc.kycservice.services.interfaces;

import io.kyc.kycservice.dto.CustomerRequestDto;
import io.kyc.kycservice.entity.CustomerRequest;

public interface CustomerRequestServiceInterface {

    CustomerRequest createRequest(CustomerRequestDto customerRequestDto);


}
