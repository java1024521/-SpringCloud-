package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import user.entity.User;
import user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("我是user-service1");
    return userService.queryUserById(id);
    }
}
