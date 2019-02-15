package ua.od.HackathonHillel.service;

import ua.od.HackathonHillel.dto.AccountDto;
import ua.od.HackathonHillel.entity.AccountEntity;

public interface AccountService {
    AccountEntity addNewUser(AccountDto user);
    Boolean verifyUser(AccountDto user);
}
