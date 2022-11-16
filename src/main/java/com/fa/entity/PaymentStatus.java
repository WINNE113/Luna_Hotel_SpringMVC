package com.fa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "paymentstatus")
public class PaymentStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long paymentStatusId;

    @Column(name = "paymentstatus" , nullable = false, length = 50)
    private String paymentStatus;

    @Column(name = "paymentactive", nullable = false)
    private boolean paymentActive;

    @Column(name = "paymentdesc" , columnDefinition = "TEXT")
    private String paymentDesc;

    @OneToMany(mappedBy = "paymentStatus")
    private List<Payment> paymentList = new ArrayList<>();
}
