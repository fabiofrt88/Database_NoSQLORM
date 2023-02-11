package com.example.demo.controllers;


import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @PostMapping("")
    public User createUser (@RequestBody User user) {
        return userRepo.save(user);
    }

    @GetMapping("/getalluser")
    public List<User> getUsers () {
        return userRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById (@PathVariable String id) {
        return userRepo.findById(id);
    }

    @PutMapping("/{id}")
    public User editUser (@PathVariable String id, @RequestBody User user){
       user.setId(id);
       return userRepo.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById (@PathVariable String id){
        userRepo.deleteById(id);
    }

}
