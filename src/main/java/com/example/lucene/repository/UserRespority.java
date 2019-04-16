package com.example.lucene.repository;

import com.example.lucene.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Greated by Terry on 2019/4/16
 * Time: 10:28
 */
public interface UserRespority extends CrudRepository<User,Integer>{


    User findByUsernameAndPassword(String username,String password);



}
