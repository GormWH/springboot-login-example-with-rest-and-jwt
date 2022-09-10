package com.example.payload.request;

import lombok.Data;

import java.util.Set;

@Data
public class SignupRequest {
    private String id;
    private String pw;
    private Set<String> roles;
}
