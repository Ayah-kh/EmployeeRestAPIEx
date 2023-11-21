package com.example.EmployeeAPI.repository;

import com.example.EmployeeAPI.entity.Car;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
