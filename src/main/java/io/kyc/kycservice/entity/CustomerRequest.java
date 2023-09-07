package io.kyc.kycservice.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Builder
@Setter
@Getter
@Entity
@Table(schema = "customer_requests")
public class CustomerRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "customer_name", nullable = false)
    private String customerName;
    @Column(name = "customer_phone", nullable = false)
    private String phone;
    @Column(name = "customer_personal_code", nullable = false, unique = true)
    private String idnp;
    @Column(name = "customer_email", nullable = false)
    private String email;
    @OneToMany(targetEntity = User.class)
    @Column(name = "user_id", nullable = false)
    private Long userId;
}
