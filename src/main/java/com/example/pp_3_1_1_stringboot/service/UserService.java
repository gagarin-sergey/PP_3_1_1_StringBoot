package com.example.pp_3_1_1_stringboot.service;

import com.example.pp_3_1_1_stringboot.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void delete(Long id);
    void update(User user);
    List<User> getList();
    User getUser(Long id);
}
