package com.fa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long paymentId;

    @Column(name = "paymentdate")
    private Date paymenDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paymentstatusid")
    private PaymentStatus paymentStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paymenttype")
    private PaymentType paymentType;

    @OneToMany(mappedBy = "paymentBill")
    private List<Bill> billList = new ArrayList<>();

    public long getPaymentId() {
        return paymentId;
    }

    public Date getPaymenDate() {
        return paymenDate;
    }

    public void setPaymenDate(Date paymenDate) {
        this.paymenDate = paymenDate;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
