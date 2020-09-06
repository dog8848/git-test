package cn.catcatmeow.service.impl;

import cn.catcatmeow.dao.AccountDao;
import cn.catcatmeow.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements cn.catcatmeow.service.AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public Account findById(Integer id) {
        return accountDao.selectByPrimaryKey(id);
    }
}
