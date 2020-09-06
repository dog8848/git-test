package cn.catcatmeow.service;

import cn.catcatmeow.pojo.Account;

//账户业务层接口
public interface AccountService {
    Account findById(Integer id);
}
