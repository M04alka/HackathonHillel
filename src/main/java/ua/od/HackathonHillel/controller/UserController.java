package ua.od.HackathonHillel.controller;

import ua.od.HackathonHillel.dto.AccountDto;

import javax.ws.rs.core.Response;

public interface UserController {
    Response loginUser(AccountDto user);
    javax.ws.rs.core.Response createNewUser(AccountDto user);
}
