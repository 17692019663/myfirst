package com.example.demo.intel;

import com.example.demo.pojo.Bankuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankuserRepository extends JpaRepository<Bankuser,Long> {

}
