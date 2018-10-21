package com.sit.cloudnative.Userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.sit.cloudnative.Userservice.model.User;
import com.sit.cloudnative.Userservice.repository.UserRepositoryInterface;

@Service
public class UserService {

  @Autowired
  private UserRepositoryInterface UserRepositoryInterface;

  public User getUserById(String user_id) {
    return UserRepositoryInterface.getOne(user_id);
  }

  public List<User> getAllUser() {
    return UserRepositoryInterface.findAll();
  }
}
