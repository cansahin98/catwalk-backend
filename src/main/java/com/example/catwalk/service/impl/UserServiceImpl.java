package com.example.catwalk.service.impl;

import com.example.catwalk.entity.User;
import com.example.catwalk.repo.UserRepository;
import com.example.catwalk.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {
    private final UserRepository repo;


    @Override
    public User register(User user) {
        User user1 = repo.save(user);
        return user1;
    }
}
