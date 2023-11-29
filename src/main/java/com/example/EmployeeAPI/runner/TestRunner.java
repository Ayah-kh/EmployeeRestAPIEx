package com.example.EmployeeAPI.runner;

import com.example.EmployeeAPI.entity.Employee2;
import com.example.EmployeeAPI.model.Employee;
import com.example.EmployeeAPI.repository.Employee2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class TestRunner implements CommandLineRunner {


    private Employee2Repository repo;

    public TestRunner(Employee2Repository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {

        repo.searchByIdRange(5,10).forEach(System.out::println);
    }


}
