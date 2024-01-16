package com.NetworkMarketing.NetworkMarketing.controller;

import com.NetworkMarketing.NetworkMarketing.dtos.RegisterUserReponseDto;
import com.NetworkMarketing.NetworkMarketing.dtos.RegisterUserRequstDto;
import com.NetworkMarketing.NetworkMarketing.services.UserService;

public class UserController {


    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

     RegisterUserReponseDto registerUser(RegisterUserRequstDto registerUserRequstDto){


        return null;
     }

}
