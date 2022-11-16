package com.fa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    @Column(name = "occupancy")
    private float Occupancy;

    @Column(name = "floorno")
    private int FloorNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roomrateid")
    private RoomRate roomRate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roomtypename")
    private RoomType roomType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotelcode")
    private Hotel hotel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roomstatus")
    private RoomStatus roomStatus;

    @OneToMany(mappedBy = "bookingRoom")
    private List<Booking> list = new ArrayList<>();
}
