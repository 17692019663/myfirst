package com.example.demo.Service;

import com.example.demo.intel.BankuserRepository;
import com.example.demo.pojo.Bankuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BankuserService {
    @Autowired
    private BankuserRepository bankuserRepository;

    public List<Bankuser> Regiest(Bankuser bankuser){
        List<Bankuser> list = new ArrayList();
        bankuser = bankuserRepository.save(bankuser);
        list.add(bankuser);
        return list;
    }
    public void update1(){

    }
    public void update2(){

    }
    @Transient
    public void zhuan(){
        update1();
        update2();
    }
}
