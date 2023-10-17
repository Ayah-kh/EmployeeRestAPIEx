package com.example.EmployeeAPI.Controller;

import com.example.EmployeeAPI.model.Employee;
import com.example.EmployeeAPI.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new  ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
    }

    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
return new ResponseEntity<>(employeeService.getEmployeeById(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee,@PathVariable long id){
    return new ResponseEntity<>(employeeService.updateEmployee(employee,id),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable long id){
        return new ResponseEntity<>("Successfully deleted",HttpStatus.OK);
    }
}
