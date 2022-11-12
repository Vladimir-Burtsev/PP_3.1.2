package com.burtsev.pp311.service;


//import com.burtsev.pp311.dao.UserRepo;
import com.burtsev.pp311.dao.UserRepo;
import com.burtsev.pp311.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService{
    private final UserRepo userRepo;
    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(int id) {
        return userRepo.findById(id).get();
    }

    @Transactional
    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Transactional
    @Override
    @PostMapping
    public void update(User updatedUser) {
        userRepo.save(updatedUser);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }
}
