package com.example.EmployeeManagement.Servise;

import com.example.EmployeeManagement.Exception.ResourceNotFoundException;
import com.example.EmployeeManagement.dto.EmployeeDto;
import com.example.EmployeeManagement.entity.Employeesdetails;
import com.example.EmployeeManagement.mapper.EmployeeMapper;
import com.example.EmployeeManagement.repository.EmployeesdetailsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class  EmployeeServiceImpl implements EmployeeService{
    private EmployeesdetailsRepository employeeRepository;

    @Override
    public EmployeeDto createEmployeesdetails (EmployeeDto employeeDto) {
        Employeesdetails employee = EmployeeMapper.mapToEmployeesdetails (employeeDto);
        Employeesdetails createEmployeesdetails= employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto (createEmployeesdetails);
    }

    @Override
    public EmployeeDto getEmployeesdetailsById(Long employeeId) {

        Employeesdetails employeesdetails=employeeRepository.findById(employeeId)
            .orElseThrow(()-> new ResourceNotFoundException("Employee is not exists with given Id: " + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employeesdetails);
   }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employeesdetails>employeesdetails=employeeRepository.findAll();
       return employeesdetails.stream().map((employee) -> EmployeeMapper.mapToEmployeeDto (employee)).collect(Collectors.toList());
}

    @Override
    public EmployeeDto updateEmployeesdetails(Long employeeId, EmployeeDto updateEmployeesdetails) {
        Employeesdetails employeesdetails=employeeRepository.findById(employeeId).orElseThrow(()
        -> new ResourceNotFoundException("Employee is not exists with given Id: " + employeeId));

        employeesdetails.setName(updateEmployeesdetails.getName());
        employeesdetails.setQualification(updateEmployeesdetails.getQualification());
        employeesdetails.setMail(updateEmployeesdetails.getMail());
        employeesdetails.setPhone(updateEmployeesdetails.getPhone());
        employeesdetails.setSalary(updateEmployeesdetails.getSalary());

        Employeesdetails updatedEmployeesdetails=employeeRepository.save(employeesdetails);
        return EmployeeMapper.mapToEmployeeDto(updatedEmployeesdetails);

    }

    @Override
    public void deleteEmployeesdetails(Long employeeId) {
        Employeesdetails employeesdetails=employeeRepository.findById(employeeId).orElseThrow(()
                -> new ResourceNotFoundException("Employee is not exists with given Id: " + employeeId));
        employeeRepository.deleteById(employeeId);
    }
}
