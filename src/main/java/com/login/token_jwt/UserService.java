package com.login.token_jwt;

import org.springframework.stereotype.Service;

import

import java.util.Optional;

@Service
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User save(User user) {return repository.save(user);}

    public Optional<User> getUser(String name) {return repository.findByUsername(name);}

    public void delete(Long id) {repository.deleteById(id);}
}
