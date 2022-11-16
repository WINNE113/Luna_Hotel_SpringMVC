package com.fa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employeerole",
        uniqueConstraints = {
        @UniqueConstraint(
                name = "emprole_title_unique", columnNames = "title"
        )
        }
)
public class EmployeeRole {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long roleId;

    @Column(name = "title", nullable = false, length = 20)
    private String title;

    @Column(name = "roledesc", columnDefinition = "TEXT")
    private String roleDesc;

    @OneToMany(mappedBy = "employeeRole")
    private List<Employee> employeeList = new ArrayList<>();

    public long getRoleId() {
        return roleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRoleDes() {
        return roleDesc;
    }

    public void setRoleDes(String roleDes) {
        this.roleDesc = roleDes;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
