package com.fa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hotel" ,
uniqueConstraints = {
        @UniqueConstraint(name = "phone_hotel_unique" , columnNames = "phonehotel")
})
public class Hotel {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long hotelCode;

    @Column(name = "hoteladd" , nullable = false , length = 30)
    private String hotelAddress;

    @Column(name = "numrooms" , length = 50, nullable = false)
    private int numRooms;

    @Column(name = "phonehotel" , nullable = false , length = 12)
    private String phoneHotelNo;

    @Column(name = "startrating")
    private double starRating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cityid")
    private City city;

    @OneToMany(mappedBy = "hotel")
    private List<Room> roomList = new ArrayList<>();

    @OneToMany(mappedBy = "bookingHotel")
    private List<Booking> bookings = new ArrayList<>();


    public long getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(long hotelCode) {
        this.hotelCode = hotelCode;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public String getPhoneHotelNo() {
        return phoneHotelNo;
    }

    public void setPhoneHotelNo(String phoneHotelNo) {
        this.phoneHotelNo = phoneHotelNo;
    }

    public double getStarRating() {
        return starRating;
    }

    public void setStarRating(double starRating) {
        this.starRating = starRating;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
