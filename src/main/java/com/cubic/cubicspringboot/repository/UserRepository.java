package com.cubic.cubicspringboot.repository;

import com.cubic.cubicspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
