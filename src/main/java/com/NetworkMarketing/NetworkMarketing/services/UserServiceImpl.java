package com.NetworkMarketing.NetworkMarketing.services;

import com.NetworkMarketing.NetworkMarketing.models.User;
import com.NetworkMarketing.NetworkMarketing.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(String username,String email, String password, String phoneNumber, String address) {

        Optional<User> userOptional=userRepository.findByEmail(email);
        if(userOptional.isPresent()){
            throw new RuntimeException("user already present");
        }
        User user= new User();
        user.setUserName(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setAddress(address);
        User savedUser = userRepository.save(user);
        return savedUser;
    }
}
