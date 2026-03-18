package com.example.EmployeeManagement.controller;

import com.example.EmployeeManagement.Servise.EmployeeService;
import com.example.EmployeeManagement.dto.EmployeeDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    // Build Add Employee Rest API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployeesdetails (@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployeee=employeeService.createEmployeesdetails (employeeDto);
        return new ResponseEntity<>(savedEmployeee, HttpStatus.CREATED);
    }


// Build Get employee Rest Api
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto>getEmployeesdetailsById(@PathVariable("id") Long employeeId) {
        EmployeeDto employeeDto=employeeService.getEmployeesdetailsById(employeeId);
        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employeesdetails=employeeService.getAllEmployees();
        return new ResponseEntity<>(employeesdetails, HttpStatus.OK);
    }

    // Build Update Employee Rest Api
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto>updateEmployeesdetails(@PathVariable("id") Long employeeId,@RequestBody EmployeeDto updatedEmployeesdetails){
        EmployeeDto employeeDto=employeeService.updateEmployeesdetails(employeeId,updatedEmployeesdetails);
       return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }

    //Build Delete Employee Rest Api
    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteEmployeesdetails(@PathVariable("id") Long employeeId) {
        employeeService.deleteEmployeesdetails(employeeId);
        return new ResponseEntity<>("Employee Deleted Succesfully", HttpStatus.OK);
    }

}


