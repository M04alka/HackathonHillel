package ua.od.HackathonHillel.repository.dao;


import ua.od.HackathonHillel.entity.AccountEntity;

import java.util.List;

public interface AccountDao {

    AccountEntity addNewUser(AccountEntity user);
    List<AccountEntity> checkUsers();

}
