package com.example.EmployeeManagement.Servise;

import com.example.EmployeeManagement.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService{
    EmployeeDto createEmployeesdetails(EmployeeDto employeeDto);

    EmployeeDto getEmployeesdetailsById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployeesdetails(Long employeeId,EmployeeDto updateEmployeesdetails);

    void deleteEmployeesdetails(Long employeeId);

}
