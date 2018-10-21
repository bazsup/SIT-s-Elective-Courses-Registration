package com.sit.cloudnative.Userservice.repository;

import com.sit.cloudnative.Userservice.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryInterface extends JpaRepository<User, String> {

}
