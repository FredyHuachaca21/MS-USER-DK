package com.fredgar.pe.controller;

import com.fredgar.pe.model.User;
import com.fredgar.pe.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

  private final IUserService userService;

  @GetMapping("/all")
  public ResponseEntity<List<User>> getAllUsers() {
    return ResponseEntity.ok(userService.getAllUsers());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<User>> getUserById(@PathVariable Integer id) {
    return ResponseEntity.ok(userService.findByUserId(id));
  }

  @PostMapping("/save")
  public ResponseEntity<User> saveUser(@RequestBody User user) {
    return ResponseEntity.ok(userService.createUser(user));
  }

  @PutMapping("/update")
  public ResponseEntity<User> updateUser(@RequestBody User user, Integer id) {
    return ResponseEntity.ok(userService.updateUser(user, id));
  }

  @DeleteMapping("/delete")
  public ResponseEntity<Void> deleteUser(Integer id) {
    userService.deleteUserById(id);
    return ResponseEntity.noContent().build();
  }


}
