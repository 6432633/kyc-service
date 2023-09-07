package io.kyc.kycservice.reportfactory;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Builder
@Setter
@Getter
@ToString
public class Document {
    private String firstName;
    private String lastName;
    private String idnp;
    private LocalDate dateOfBirth;
    private LocalDate issueDate;
    private String issuer;
}
