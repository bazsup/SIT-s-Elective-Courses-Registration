package com.sit.cloudnative.Userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public User getUserById(String user_id) {
    return userRepository.getOne(user_id);
  }

  public List<User> getAllUser() {
    return userRepository.findAll();
  }
}
