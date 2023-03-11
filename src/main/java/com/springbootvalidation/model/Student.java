package com.springbootvalidation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Must be not null")
    @Size(min = 5, max = 20, message = "Must be a minimum of 5 and a maximum of 20 characters")
    private String name;

    @NotNull(message = "Must be not null")
    @Size(min = 5, max = 20, message = "Must be a minimum of 5 and a maximum of 20 characters")
    private String surname;

    @NotNull(message = "Must be not null")
    @Size(min = 5, max = 30, message = "Must be a minimum of 5 and a maximum of 20 characters")
    private String schoolName;

    @Email(message = "Email should be valid")
    private String mail;
    @Min(value = 15, message = "Cannot be younger than 15 years old")
    @Max(value = 40, message = "Cannot be older than 40 years old")
    private int age;
    @Pattern(regexp = "(?:\\d{3}-){2}\\d{4}")
    private  String phone;

}
