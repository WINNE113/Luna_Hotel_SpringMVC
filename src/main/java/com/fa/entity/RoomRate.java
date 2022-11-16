package com.fa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import com.fa.entity.Room;

@Entity
@Table(name = "roomrate", uniqueConstraints = {
        @UniqueConstraint(name = "roomrate_unique" , columnNames = "roomrate")
})
public class RoomRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roomRateId;

    @Column(name = "roomrate" , nullable = false, length = 10)
    private int roomRate;

    @Column(name = "roomratedesc", columnDefinition = "TEXT")
    private String roomRateDesc;

    @OneToMany(mappedBy = "roomRate")
    private List<Room> roomList = new ArrayList<>();

    public long getRoomRateId() {
        return roomRateId;
    }

    public int getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(int roomRate) {
        this.roomRate = roomRate;
    }

    public String getRoomRateDesc() {
        return roomRateDesc;
    }

    public void setRoomRateDesc(String roomRateDesc) {
        this.roomRateDesc = roomRateDesc;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
}
