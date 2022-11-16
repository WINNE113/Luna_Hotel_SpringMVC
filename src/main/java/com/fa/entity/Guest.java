package com.fa.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "guest",
        uniqueConstraints = {
        @UniqueConstraint(name = "guest_email_unique", columnNames = "email"),
                @UniqueConstraint(name = "guest_phone_unique", columnNames = "phonenumber")
        }
)
public class Guest {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    @Column(
            name = "firstname", nullable = false, length = 10
    )
    private String firstName;
    @Column(
            name = "lastname", nullable = false, length = 10
    )
    private String lastName;
    @Column(
            name = "dbo"
    )
    private Date DOB;
    @Column(
            name = "gen"
    )
    private boolean gen;
    @Column(
            name = "phonenumber",
            nullable = false, length = 12
    )
    private String phoneNumber;
    @Column(
            name = "email",
            nullable = false,
            length = 20
    )
    private String email;
    @Column(
            name = "password",
            nullable = false, length = 12
    )
    private String password;
    @Column(
            name = "passportno", length = 12
    )
    private String passportNo;
    @Column(
            name = "address", nullable = false,
            length = 30
    )
    private String address;
    @Column(
            name = "ismembership",
            nullable = false
    )
    private boolean isMemberShip;

    public Guest() {
    }

    @OneToMany(mappedBy = "guestBooking")
    List<Booking> bookings = new ArrayList<>();

    public Guest(String firstName, String lastName, Date DOB, boolean gen, String phoneNumber, String email, String password, String passportNo, String address, boolean isMemberShip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.gen = gen;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.passportNo = passportNo;
        this.address = address;
        this.isMemberShip = isMemberShip;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public boolean isGen() {
        return gen;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isMemberShip() {
        return isMemberShip;
    }

    public void setMemberShip(boolean memberShip) {
        isMemberShip = memberShip;
    }
}
