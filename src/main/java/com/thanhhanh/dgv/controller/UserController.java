package com.thanhhanh.dgv.controller;

import com.thanhhanh.dgv.entity.User;
import com.thanhhanh.dgv.repository.UserRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @ApiOperation(value = "Lấy danh sách user", response = User.class, responseContainer = "List")
    @GetMapping("")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @ApiOperation(value = "Lấy thông tin của một user")
    @GetMapping("/{id}")
    public User getUser(@PathVariable Integer id) {
        return userRepository.findUserById(id);
    }
}
