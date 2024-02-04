package com.fredgar.pe.repository;

import com.fredgar.pe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
