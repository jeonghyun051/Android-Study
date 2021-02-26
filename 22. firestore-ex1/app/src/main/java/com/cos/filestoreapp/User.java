package com.cos.filestoreapp;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private String id;
    private String username;
    private String password;
    private String phone;
}
