package com.burtsev.pp311.dao;

import com.burtsev.pp311.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
