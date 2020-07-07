package com.conan.dao;


import com.conan.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserDaoTest {

   @Test
   public void test() {
      SqlSession sqlSession = MyBatisUtils.getSqlSession();
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
     /* List<User> users = mapper.getUsers();
      for (User user : users) {
         System.out.println(user);
      }
      User user = mapper.geUserById(1);
      System.out.println(user);*/

//      mapper.addUser(new User(6, "hello", "world"));
//      mapper.updateUser(new User(6,"hello1","world2"));
      mapper.deleteUser(6);
      sqlSession.close();
   }
}
