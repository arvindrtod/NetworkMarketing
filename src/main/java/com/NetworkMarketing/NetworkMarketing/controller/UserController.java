package com.NetworkMarketing.NetworkMarketing.controller;

import com.NetworkMarketing.NetworkMarketing.dtos.RegisterUserResponseDto;
import com.NetworkMarketing.NetworkMarketing.dtos.RegisterUserRequestDto;
import com.NetworkMarketing.NetworkMarketing.dtos.ResponseStatus;
import com.NetworkMarketing.NetworkMarketing.models.User;
import com.NetworkMarketing.NetworkMarketing.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("users")
public class UserController {


    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    RegisterUserResponseDto registerUser(@RequestBody RegisterUserRequestDto registerUserRequestDto) {
        RegisterUserResponseDto registerUserResponseDto = new RegisterUserResponseDto();
        try {
            User user = userService.registerUser(registerUserRequestDto.getUsername(),
                    registerUserRequestDto.getEmail(),
                    registerUserRequestDto.getPassword(),
                    registerUserRequestDto.getPhoneNumber(),
                    registerUserRequestDto.getAddress());

            registerUserResponseDto.setId(user.getId());
            registerUserResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
            registerUserResponseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return null;
    }

}
