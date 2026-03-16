package com.example.EmployeeManagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Table(name = "Employeesdetails")

public class Employeesdetails {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name Cannot be Blank")
    @Size(min = 3, message = "Name Must be above 3 letters")
    @Column(nullable = false,name ="Name")
    private String name;

    @NotBlank(message = "Qualification Cannot be Blank")
    @Column(nullable = false)
    private String qualification;

    @NotBlank(message = "mail Cannot be Blank")
    @Column(nullable = false, unique = true)
    @Email(message = "Email should be valid")
    private String mail;

    @NotBlank(message = "PhoneNumber Cannot be Blank")
    @Column(nullable = false, unique = true)
    private String phone;

    @NotNull(message = "Salary Must given")
    private Long salary;


}