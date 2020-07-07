package com.conan.dao;


import com.conan.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    User getUserById(int id);

    List<User> getUserByLimit(Map<String,Integer> map);

    List<User> getUserByRowBounds(Map<String,Integer> map);
}
