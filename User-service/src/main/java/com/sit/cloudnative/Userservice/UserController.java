package com.sit.cloudnative.Userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/user/{user_id}")
  public User getUserById(@PathVariable("user_id") String id) {
    return userService.getUserById(id);
  }

  @GetMapping("/users")
  public List<User> getAllUser() {
    return userService.getAllUser();
  }

}