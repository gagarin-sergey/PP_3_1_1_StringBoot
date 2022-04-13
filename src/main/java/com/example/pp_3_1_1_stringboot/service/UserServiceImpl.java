package com.example.pp_3_1_1_stringboot.service;

import com.example.pp_3_1_1_stringboot.dao.UserDao;
import com.example.pp_3_1_1_stringboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(User user) {
        userDao.add(user);
    }

    public void delete(Long id) {
        userDao.delete(id);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public List<User> getList() {
        return userDao.getList();
    }

    public User getUser(Long id) {
        return userDao.getUser(id);
    }
}
