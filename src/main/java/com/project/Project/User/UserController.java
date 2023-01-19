package com.project.Project.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/api")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/createUser")
    public @ResponseBody User createUser(@RequestBody User user) throws Exception {
        //Creating a new user (sign up)
        userService.saveUser(user);
        System.out.println("yes");
        return user;
    }
    @PostMapping("/signIn")
    public User signInUser(@RequestBody User user) throws Exception {
        return userService.findUser(user.getEmail(), user.getPassword());
    }
    @PutMapping("/modifypassword/{userId}")
    public boolean modifyPassword(@PathVariable("userId") int userId, @RequestParam String previousPassword, @RequestParam String newPassword) throws Exception {
        return userService.setPassword(userId, previousPassword, newPassword);
    }

}
