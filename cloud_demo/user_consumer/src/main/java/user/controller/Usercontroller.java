package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user.service.Uservice;

/**
 *@ClassName Usercontroller
 *@Description TODO
 *@Author DL
 *@Date 2019/11/18 16:37    
 *@Version 1.0
 */
@RestController
@RequestMapping("/user/consumer")
public class Usercontroller {
    @Autowired
    Uservice uservice;
    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") Long id){

        return uservice.getUserById(id);
    }
}
