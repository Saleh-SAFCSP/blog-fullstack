package com.example.blogsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Pattern;

@AllArgsConstructor @Data
public class RegisterForm {
    private String username;
    private String password;
    private String role;
    private String fullName;
    private String location;
    private Integer age;
}
