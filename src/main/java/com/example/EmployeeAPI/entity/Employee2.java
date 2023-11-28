package com.example.EmployeeAPI.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "employee_2")
public class Employee2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "e_id")
    private Integer empId;
    private Integer empName;
    private Integer empDept;
    private Integer empSal;

    public Employee2(Integer empName, Integer empDept, Integer empSal) {
        this.empName = empName;
        this.empDept = empDept;
        this.empSal = empSal;
    }
}
