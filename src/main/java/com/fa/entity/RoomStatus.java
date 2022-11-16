package com.fa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "roomstatus" , uniqueConstraints = {
        @UniqueConstraint(name = "roomstatus_unique" , columnNames = "roomstatus")
})
public class RoomStatus {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long roomStatusId;

    @Column(name = "roomstatusdesc", columnDefinition = "TEXT")
    private String roomStatusDesc;

    @Column(name = "roomstatus", nullable = false, length = 10)
    private String roomStatus;

    @OneToMany(mappedBy = "roomStatus")
    private List<Room> roomList = new ArrayList<>();

    public long getRoomStatusId() {
        return roomStatusId;
    }

    public String getRoomStatusDesc() {
        return roomStatusDesc;
    }

    public void setRoomStatusDesc(String roomStatusDesc) {
        this.roomStatusDesc = roomStatusDesc;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
}
