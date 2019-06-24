package com.myweb.demo.mapper;

import com.myweb.demo.pojo.User;

import java.util.List;

public interface UserMapper {
    public int add(User user);
    public void delete(int id);
    public List<User> get(int id);
    public int updata(User user);
    public List<User> list();
    public int count();
}
