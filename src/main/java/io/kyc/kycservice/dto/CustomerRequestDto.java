package io.kyc.kycservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class CustomerRequestDto {
    private String customerName;
    private String phone;
    private String idnp;
    private String email;
}
