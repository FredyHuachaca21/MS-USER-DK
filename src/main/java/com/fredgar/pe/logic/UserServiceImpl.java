package com.fredgar.pe.logic;

import com.fredgar.pe.model.User;
import com.fredgar.pe.repository.IUserRepository;
import com.fredgar.pe.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

  private final IUserRepository repository;

  @Override
  public List<User> getAllUsers() {
    return repository.findAll();
  }

  @Override
  public Optional<User> findByUserId(Integer id) {
    return repository.findById(id);
  }

  @Override
  public User createUser(User user) {
    return repository.save(user);
  }

  @Override
  public User updateUser(User user, Integer id) {
    findByUserId(id).ifPresent(u -> {
      u.setName(user.getName());
      u.setLastName(user.getLastName());
      repository.save(u);
    });
    return user;
  }

  @Override
  public void deleteUserById(Integer id) {
    findByUserId(id).ifPresent(repository::delete);
  }
}
