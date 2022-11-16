package com.fa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "city",
uniqueConstraints = {
        @UniqueConstraint(name = "city_name_unique" , columnNames = "cityname"),
        @UniqueConstraint(name = "post_code_unique" , columnNames = "postalcode")
})
public class City {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long cityId;

    @Column(name = "cityname",nullable = false , length = 20)
    private String cityName;

    @Column(name = "postalcode", nullable = false, length = 10)
    private String postalCode;

    @OneToMany(mappedBy = "city")
    private List<Hotel> hotelList = new ArrayList<>();

    public long getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public List<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(List<Hotel> hotelList) {
        this.hotelList = hotelList;
    }
}
