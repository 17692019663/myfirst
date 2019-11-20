package com.example.demo1.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class MyService {
   @Autowired(required=false)
   private JdbcTemplate jdbcTemplate;

    public int add(String name,int age){

        int i =jdbcTemplate.update("insert into student(name,age) values (?,?)",name,age);


        return i;
    }
}
