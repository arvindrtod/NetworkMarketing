package com.NetworkMarketing.NetworkMarketing.services;

import com.NetworkMarketing.NetworkMarketing.models.User;

public interface UserService {

    User registerUser(String username,String email,String password, String phoneNumber, String address);
}
