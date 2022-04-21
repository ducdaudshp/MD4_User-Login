package com.codegym.service;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private static List<User> users;
    static {
      users = new ArrayList<>();
      User u1 = new User();
      u1.setAge(10);
      u1.setName("Duc");
      u1.setAccount("duc123");
      u1.setPassword("123456");
      u1.setEmail("duc@codegym.com");
      users.add(u1);

      User u2 = new User();
      u2.setAge(12);
      u2.setName("Canh");
      u2.setAccount("canh123");
      u2.setPassword("123456");
      u2.setEmail("canh@codegym.com");
      users.add(u2);

      User u3 = new User();
      u3.setAge(15);
      u3.setName("Giang");
      u3.setAccount("giang123");
      u3.setPassword("123456");
      u3.setEmail("giang@codegym.com");
      users.add(u3);
    }

    public static User checkLogin(Login login){
        for (User u: users){
            if (u.getAccount().equals(login.getAccount())
            && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
