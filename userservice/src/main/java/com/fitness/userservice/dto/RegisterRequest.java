package com.fitness.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank(message = "Email can't be empty")
    @Email(message = "Invalid email format")
    private String email;

    private String firstName;
    private String lastName;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password should have atleast 6 characters")
    private String password;
}
