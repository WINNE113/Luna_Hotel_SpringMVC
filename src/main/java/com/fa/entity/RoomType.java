package com.fa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "roomtype")
public class RoomType {
    @Id
    private String roomTypeName;

    @Column(name = "roomprice" , nullable = false)
    private float roomPrice;

    @Column(name = "defaultroomprice" , nullable = false)
    private float defaultRoomPrice;

    @Column(name = "roomimg" , columnDefinition = "TEXT", nullable = false)
    private String roomImg;

    @Column(name = "roomdesc", columnDefinition = "TEXT")
    private String roomDesc;

    @OneToMany(mappedBy = "roomType")
    private List<Room> roomList = new ArrayList<>();

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }

    public float getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(float roomPrice) {
        this.roomPrice = roomPrice;
    }

    public float getDefaultRoomPrice() {
        return defaultRoomPrice;
    }

    public void setDefaultRoomPrice(float defaultRoomPrice) {
        this.defaultRoomPrice = defaultRoomPrice;
    }

    public String getRoomImg() {
        return roomImg;
    }

    public void setRoomImg(String roomImg) {
        this.roomImg = roomImg;
    }

    public String getRoomDesc() {
        return roomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
}
