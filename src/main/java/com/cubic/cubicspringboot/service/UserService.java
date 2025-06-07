package com.cubic.cubicspringboot.service;

import com.cubic.cubicspringboot.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    User updateUser(User user);

    void deleteUser(int id);

    User getUser(int id);

    List<User> getUsers();

    User getUserByUsername(String username);
}
