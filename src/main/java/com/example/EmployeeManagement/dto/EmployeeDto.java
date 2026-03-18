package com.example.EmployeeManagement.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeDto {
    private Long id;
    private String name;
    private String qualification;
    private String mail;
    private String phone;
    private Long salary;
}
