package com.example.taskmanager.service;

import com.example.taskmanager.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void addUser(User user);

    List<User> getAllUsers();

    User updateUser(User user);

    boolean deleteUserById(Long id);

    Optional<User> findUserById(Long id);

}
