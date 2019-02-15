package ua.od.HackathonHillel.service.impl;

import ua.od.HackathonHillel.dto.AccountDto;
import ua.od.HackathonHillel.entity.AccountEntity;
import ua.od.HackathonHillel.repository.dao.AccountDao;
import ua.od.HackathonHillel.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    private static Boolean exist;
    @Override
    public AccountEntity addNewUser(AccountDto account) {
        AccountEntity user = new AccountEntity();
        user.setAdressId(account.getAdressId());
        user.setFirstname(account.getFirstname());
        user.setLastname(account.getLastname());
        return accountDao.addNewUser(user);
    }

    @Override
    public Boolean verifyUser(AccountDto user) {
        List<AccountEntity> acountList = accountDao.checkUsers();
        acountList.forEach(accountEntity -> {
            if(user.getAdressId()== accountEntity.getAdressId() &&
                    user.getFirstname()== accountEntity.getFirstname() &&
                    user.getLastname() == accountEntity.getLastname())
            {
                exist = true;
            }
            else
            {
                exist = false;
            }

        });
        return exist;
    }
}
