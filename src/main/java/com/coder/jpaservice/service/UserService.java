package com.coder.jpaservice.service;

import com.coder.jpaservice.dto.UserDto;
import com.coder.jpaservice.model.UserModel;
import com.coder.jpaservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserDto findUserById(long id) {
        UserModel userModel = userRepository.findById(id).orElseThrow(()->new RuntimeException("Invalid user"));
        UserDto userDto = UserDto.from(userModel);
        return userDto;
    }

    public UserDto updateUserById(long id, UserDto userDto) {
        UserModel userModel = userRepository.findById(id).orElseThrow(()->new RuntimeException("Invalid user"));
        userModel.setUserName(userDto.getUserName());
        userModel.setPassword(userDto.getPassword());
        userModel = userRepository.save(userModel);
        UserDto user = UserDto.from(userModel);
        return user;
    }

    public UserDto insertUserById(UserDto userDto) {
        UserModel userModel = new UserModel();
        userModel.setUserName(userDto.getUserName());
        userModel.setPassword(userDto.getPassword());
        userModel = userRepository.save(userModel);
        UserDto user = UserDto.from(userModel);
        return user;
    }
}
