package com.NetworkMarketing.NetworkMarketing.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class RegisterUserRequestDto {

    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String address;

}
