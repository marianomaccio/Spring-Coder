package com.coder.jpaservice.controller;

import com.coder.jpaservice.dto.UserDto;
import com.coder.jpaservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;

@RestController
@RequestMapping("/sale")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/user/{id}")
    public ResponseEntity<UserDto> findUserById(@PathVariable(name = "id") long id){
        return new ResponseEntity<>(userService.findUserById(id), HttpStatus.ACCEPTED);
    }

    @PutMapping(value = "/user/{id}")
    public ResponseEntity<UserDto> updateUserById(@PathVariable(name = "id") long id, @RequestBody UserDto userDto){
        return new ResponseEntity<>(userService.updateUserById(id, userDto), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/user")
    public ResponseEntity<UserDto> insertUserById(@RequestBody UserDto userDto){
        return new ResponseEntity<>(userService.insertUserById(userDto), HttpStatus.ACCEPTED);
    }
}
