package com.example.demo.intel;

import com.example.demo.pojo.Bankuser;
import com.example.demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    //读取所有User
    @Override
    List<User> findAll();
    //读取指定id的user
    List<User> findAllById (int uid);
    //删除指定id的user
    int deleteAllById (int uid);
    //修改指定id的user
    int countAllById (User user);
}
