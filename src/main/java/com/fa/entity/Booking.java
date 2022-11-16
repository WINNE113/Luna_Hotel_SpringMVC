package com.fa.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long bookingId;

    @Column(name = "bookingdate", nullable = false)
    private Date bookingDate;

    @Column(name = "bookingTime", nullable = false)
    private Time bookingTime;

    @Column(name = "arrivaldate" , nullable = false)
    private Date arrivalDate;

    @Column(name = "departuredate" , nullable = false)
    private Date departureDate;

    @Column(name = "numadults")
    private int numAdults;

    @Column(name = "numchildren")
    private int numChildren;

    @Column(name = "bookingroomcount" , nullable = false)
    private int bookingRoomCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotelcode")
    private Hotel bookingHotel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "guestid")
    private Guest guestBooking;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roomnumber")
    private Room bookingRoom;

    @OneToMany(mappedBy = "bookingBill")
    private List<Bill> billList = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookingstatusid")
    private BookingStatus bookingStatus;
 }
