package com.example.EmployeeManagement.mapper;

import com.example.EmployeeManagement.dto.EmployeeDto;
import com.example.EmployeeManagement.entity.Employeesdetails;


public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto (Employeesdetails employeedetails) {
        return new EmployeeDto(
                employeedetails.getId(),
                employeedetails.getName(),
                employeedetails.getQualification(),
                employeedetails.getMail(),
                employeedetails.getPhone(),
                employeedetails.getSalary()
        );
    }
    public static Employeesdetails mapToEmployeesdetails (EmployeeDto employeeDto) {
        return new Employeesdetails(
                employeeDto.getId(),
                employeeDto.getName(),
                employeeDto.getQualification(),
                employeeDto.getMail(),
                employeeDto.getPhone(),
                employeeDto.getSalary()
        );
    }
}

