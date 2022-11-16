package com.fa.entity;

import org.springframework.dao.DataAccessException;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee" ,
    uniqueConstraints = {
        @UniqueConstraint(
                name = "phone_employee_unique" , columnNames = "phonenumber"
        ), @UniqueConstraint(
                    name = "email_employee_unique" , columnNames = "email"
            )
    }
)
public class Employee {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long employeeId;

    @Column(name = "firstname", nullable = false, length = 10)
    private String firstName;

    @Column(name = "lastname", nullable = false, length = 10)
    private String lastName;

    @Column(name = "dbo")
    private Date dbo;

    @Column(name = "gender")
    private boolean gender;

    @Column(name = "phonenumber" , nullable = false , length = 12)
    private String phoneNo;

    @Column(name = "email", length = 50 , nullable = false)
    private String email;

    @Column(name = "employeepassword", length = 12 , nullable = false)
    private String employeePassword;

    @Column(name = "createdtime")
    private Date createdTime;

    @Column(name = "updatetime")
    private Date updateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleid")
    private EmployeeRole employeeRole;

    public long getEmployeeId() {
        return employeeId;
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

    public Date getDbo() {
        return dbo;
    }

    public void setDbo(Date dbo) {
        this.dbo = dbo;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneName(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public EmployeeRole getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(EmployeeRole employeeRole) {
        this.employeeRole = employeeRole;
    }
}
