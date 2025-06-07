package com.ecom.app;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> userList = new ArrayList<>();

    public List<User> fetchAllUsers(){
        return userList;
    }

    public Long id = 1L;

    public List<User> createUser(User user){
        user.setId(id++);
        userList.add(user);
        return userList;
    }
}
