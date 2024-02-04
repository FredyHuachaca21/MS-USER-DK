package com.fredgar.pe.service;

import com.fredgar.pe.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

  List<User> getAllUsers();
  Optional<User> findByUserId(Integer id);
  User createUser(User user);
  User updateUser(User user, Integer id);
  void deleteUserById(Integer id);

}
