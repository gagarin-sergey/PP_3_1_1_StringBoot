package com.example.pp_3_1_1_stringboot.dao;

import com.example.pp_3_1_1_stringboot.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(Long id);
    void update(User user);
    List<User> getList();
    User getUser(Long id);
}
