package com.fa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bill")
public class Bill {
    @Id
    private String invoiceNo;

    @Column(name = "iflatecheckout")
    private boolean iflatecheckout;

    @Column(name = "discount")
    private float discount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookingid")
    private Booking bookingBill;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paymentid")
    private Payment paymentBill;


}
