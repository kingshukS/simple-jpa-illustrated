package io.kingshuk.jpa.simplejpaillustrated.controller;

import io.kingshuk.jpa.simplejpaillustrated.entity.User;
import io.kingshuk.jpa.simplejpaillustrated.service.UserDAOService;
import io.kingshuk.jpa.simplejpaillustrated.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDAOService userDAOService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/users")
    public void saveUser(@RequestBody User user) {
         userService.saveUser(user);
    }

    @PostMapping("/users-v2")
    public void insertUser(@RequestBody User user) {
        userDAOService.insert(user);
    }
}
