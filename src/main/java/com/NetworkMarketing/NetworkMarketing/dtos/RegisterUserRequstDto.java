package com.NetworkMarketing.NetworkMarketing.dtos;

import lombok.Data;

@Data
public class RegisterUserRequstDto {

    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String address;
}
