package cn.catcatmeow.web.controller;

import cn.catcatmeow.pojo.Account;
import cn.catcatmeow.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/{id}")
    public Account queryAccountById(@PathVariable(value = "id",required = true) int id){
        return accountService.findById(id);
    }

}
