package com.bear.controller;


import com.bear.pojo.User;
import com.bear.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }

    @RequestMapping("insertUser")
    public void InsertUser(){
        User user = new User();
        user.setId(2);
        user.setUserName("huangkun");
        user.setUstatus("C#");
        userService.InsertUser(user);
    }

    @RequestMapping("updateUser")
    public void UpdateUser() {
        User user = new User();
        user.setId(1);
        user.setUserName("wangchunyan");
        user.setUstatus("C#");
        userService.UpdateUser(user);
    }

    @RequestMapping("deleteUser")
    public void DeleteUser() {
        userService.DeleteUser(1);
    }

    @RequestMapping("findByPager")
    public String FindByPager(){
        return UserService.findByPager(1,1);
    }
}
