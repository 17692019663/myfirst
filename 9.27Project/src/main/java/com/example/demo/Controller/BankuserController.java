package com.example.demo.Controller;

import com.example.demo.Service.BankuserService;
import com.example.demo.pojo.Bankuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BankuserController {
    @Autowired
    private BankuserService bankuserService;
    @RequestMapping("regiest")
    @ResponseBody
    public List<Bankuser> regiest(Bankuser bankuser){
        //md5加密算法
        String pass = DigestUtils.md5DigestAsHex(bankuser.getPass().getBytes());
        bankuser.setPass(pass);
        List<Bankuser> list = bankuserService.Regiest(bankuser);
        return list;
    }
}
