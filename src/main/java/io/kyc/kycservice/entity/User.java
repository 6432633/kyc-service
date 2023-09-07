package io.kyc.kycservice.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_name",unique = true, nullable = false)
    private String userName;
    @Column(name = "date_of_creation", nullable = false)
    private LocalDate dateOfCreation;
    @Column(name = "api_key", unique = true, nullable = false)
    private String apiKey;
}
