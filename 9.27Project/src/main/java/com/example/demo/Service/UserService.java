package com.example.demo.Service;

import com.example.demo.intel.UserRepository;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
       return userRepository.findAll();
    }

    public List<User> getById(int id){
        return userRepository.findAllById(id);
    }

    public int deleteById(int id){
        return userRepository.deleteAllById(id);
    }

    public int updayeById(User user){
        return userRepository.countAllById(user);
    }
}
