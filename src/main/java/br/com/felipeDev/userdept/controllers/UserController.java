
package br.com.felipeDev.userdept.controllers;


import br.com.felipeDev.userdept.entities.User;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.felipeDev.userdept.repositories.UserRepository;

import java.util.List;


@RestController
@RequestMapping(value = "/users")
public class UserController {


    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public User findAll(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        return repository.save(user);
    }
}







