package com.fitness.userservice.dto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserResponse {
    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
