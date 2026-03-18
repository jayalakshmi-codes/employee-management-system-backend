package com.example.EmployeeManagement.repository;

import com.example.EmployeeManagement.entity.Employeesdetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeesdetailsRepository extends JpaRepository<Employeesdetails, Long> {
    void deleteByName(String name);

    Optional<Employeesdetails> findByName(String name);
}
