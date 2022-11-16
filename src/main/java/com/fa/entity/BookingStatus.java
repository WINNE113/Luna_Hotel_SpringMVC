package com.fa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bookingstatus")
public class BookingStatus {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long bookingStatusId;

    @Column(name = "bookingstatus", nullable = false, length = 30)
    private String bookingStatus;

    @Column(name = "bookingstatusdesc", columnDefinition = "TEXT")
    private String bookingStatusDesc;

    @Column(name = "bookingactive", nullable = false)
    private boolean bookingActive;

    @OneToMany(mappedBy = "bookingStatus")
    private List<Booking> bookingList = new ArrayList<>();
}
