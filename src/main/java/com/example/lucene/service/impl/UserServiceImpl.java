package com.example.lucene.service.impl;

import com.example.lucene.domain.User;
import com.example.lucene.repository.UserRespority;
import com.example.lucene.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Greated by Terry on 2019/4/16
 * Time: 10:28
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRespority userRespority;

    @Override
    public User findByUsernameAndPassword(String username, String password) {
     User user=userRespority.findByUsernameAndPassword(username,password);
        return user;
    }

    @Override
    public List<User> findByUser() {
        List<User> list= (List<User>) userRespority.findAll();
        return list;
    }

    @Override
    public User registerUser(User user) {
        userRespority.save(user);
        return user;
    }

    @Override
    public void removeUser(Integer id) {
    userRespority.deleteById(id);
    }

    @Override
    public Optional<User> getUserById(Integer id) {
        Optional<User>user= userRespority.findById(id);
        return user;
    }
}
