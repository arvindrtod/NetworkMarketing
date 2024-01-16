package com.NetworkMarketing.NetworkMarketing.services;

import com.NetworkMarketing.NetworkMarketing.models.User;
import com.NetworkMarketing.NetworkMarketing.repositories.UserRepository;

public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(String username,String email, String password, String phoneNumber, String address) {


        return null;
    }
}
