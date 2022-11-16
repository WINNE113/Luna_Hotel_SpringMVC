package com.fa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "paymenttype")
public class PaymentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long paymentTypeId;

    @Column(name = "creditcard", nullable = false)
    private int creditCard;

    @Column(name = "paymentexpiredate")
    private Date paymentExpireDate;

    @Column(name = "chequeno")
    private int chequeno;

    @OneToMany(mappedBy = "paymentType")
    private List<Payment> list = new ArrayList<>();
}
