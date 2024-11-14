package com.microservices.auth.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterDto {
    private String name;
    private String username;
    private String password;
}
