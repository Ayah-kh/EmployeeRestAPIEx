package com.example.EmployeeAPI.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table (name = "emp_tab")
public class Employee2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "e_id")
    private Integer empId;
    private String empName;
    private String empDept;
    private Double empSal;

    public Employee2() {
    }

    public Employee2(String empName, String empDept, Double empSal) {
        this.empName = empName;
        this.empDept = empDept;
        this.empSal = empSal;
    }
}
