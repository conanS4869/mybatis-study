package com.conan.dao;

import com.conan.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUserLike(String value);

    List<User> getUserList();

    User getUserById(int id);

    User getUserById2(Map<String,Object> map);

    int addUser(User user);

    int addUser2(Map<String,Object> map);

    int updateUser(User user);

    int deleteUser(int id);


}
