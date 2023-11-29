package com.example.EmployeeAPI.repository;

import com.example.EmployeeAPI.EmployeeApiApplication;
import com.example.EmployeeAPI.entity.Employee2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Employee2Repository extends JpaRepository<Employee2,Integer> {

    //named parameters
    //SELECT*FROM [table_name] WHERE EID>=MIN AND EID<=MAX;
    @Query("From Employee2 WHERE empId>=:min and empId<=:max")
    List <Employee2> fetchEmployeeByIdRange(int min,int max);

    //Positional param
    @Query("FROM Employee2 WHERE empId>=?1 and empId<=?2")
    public List<Employee2> searchByIdRange(int min, int max);

    @Query(value = "SELECT*FROM ")
    public List<Employee2> searchEmpByDept(String dept);
}
