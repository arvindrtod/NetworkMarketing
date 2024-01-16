package com.NetworkMarketing.NetworkMarketing.controller;

import com.NetworkMarketing.NetworkMarketing.dtos.RegisterUserReponseDto;
import com.NetworkMarketing.NetworkMarketing.dtos.RegisterUserRequstDto;
import com.NetworkMarketing.NetworkMarketing.dtos.ResponseStatus;
import com.NetworkMarketing.NetworkMarketing.models.User;
import com.NetworkMarketing.NetworkMarketing.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {


    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    RegisterUserReponseDto registerUserReponseDto = new RegisterUserReponseDto();

    RegisterUserReponseDto registerUser(RegisterUserRequstDto registerUserRequstDto) {
        try {
            User user = userService.registerUser(registerUserRequstDto.getUsername(),
                    registerUserRequstDto.getEmail(),
                    registerUserRequstDto.getPassword(),
                    registerUserRequstDto.getPhoneNumber(),
                    registerUserRequstDto.getAddress());

            registerUserReponseDto.setId(user.getId());
            registerUserReponseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
            registerUserReponseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return null;
    }

}
