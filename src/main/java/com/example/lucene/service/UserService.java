package com.example.lucene.service;

import com.example.lucene.domain.User;

import java.util.List;
import java.util.Optional;

/**
 * Greated by Terry on 2019/4/16
 * Time: 10:27
 */
public interface UserService {

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    User findByUsernameAndPassword(String username, String password);

    /**
     * 查全
     * @return
     */
    List<User> findByUser();

    /**
     * 注册 or新增
     * @param user
     * @return
     */
    User registerUser(User user);

    /**
     * 根据ID删除
     * @param id
     */
    void removeUser(Integer id);

    /**
     * 根据ID 获取用户信息
     * @param id
     * @return
     */
    Optional<User> getUserById(Integer id);

}
