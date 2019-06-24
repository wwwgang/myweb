package com.myweb.demo.controller;

import com.myweb.demo.mapper.UserMapper;
import com.myweb.demo.pojo.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserMapper usermapper;
    @PostMapping("/add")
    public String add(@RequestBody User user) {
//        User user = new User();
//        user.setUsername("wg");
//        user.setPassword("123");
        usermapper.add(user);
        return "success";
    }
    @RequestMapping("/get")
    public List<User> get(@RequestParam(name = "id") String id){
        List<User> list = usermapper.get(Integer.parseInt(id));
        return list;
    }
    @RequestMapping("/list")
    public List<User> list(){
        List<User> list=usermapper.list();
        return list;
    }
    @RequestMapping("/del")
    public String delete(@RequestParam(name = "id") String id){
        usermapper.delete(Integer.parseInt(id));
        return "success";
    }
    @PostMapping("/updata")
    public String updata(@RequestBody User user){
        usermapper.updata(user);
        return "success";
    }
    @RequestMapping("/count")
    public int count(){
        int count=usermapper.count();
        return count;
    }
}