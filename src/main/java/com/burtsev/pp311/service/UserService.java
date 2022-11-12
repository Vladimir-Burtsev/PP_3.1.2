package com.burtsev.pp311.service;
import com.burtsev.pp311.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUser (int id);
    void save(User user);
    void update(User updatedUser);
    void delete(int id);
}
