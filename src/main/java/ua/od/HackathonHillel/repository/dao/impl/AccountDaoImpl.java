package ua.od.HackathonHillel.repository.dao.impl;

import ua.od.HackathonHillel.entity.AccountEntity;
import ua.od.HackathonHillel.repository.dao.AccountDao;
import ua.od.HackathonHillel.repository.helper.SqlHelper;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountDaoImpl implements AccountDao {

    private static String ADD_NEW_USER =
            "INSERT INTO User (firstname, lastname,adress_id)\n" +
                    "VALUES (?, ?, ?);";

    @Override
    public AccountEntity addNewUser(AccountEntity user) {
        return SqlHelper.prepareStatement(ADD_NEW_USER, account ->{
            account.setString(1,user.getFirstname());
            account.setString(2,user.getLastname());
            account.setInt(3,user.getAdressId());
            return account.executeUpdate();
        });
    }

    private static String GET_ALL_USERS = "Select firstname, lastname,adress_id;";

    @Override
    public List<AccountEntity> checkUsers() {
        return SqlHelper.prepareStatement(GET_ALL_USERS, user -> {
            ResultSet resultSet = user.executeQuery();
            List<AccountEntity> userList = new ArrayList();
            while(resultSet.next()){
                AccountEntity account = new AccountEntity();
                account.setAdressId(resultSet.getInt("id"));
                account.setFirstname(resultSet.getString("firstname"));
                account.setLastname(resultSet.getString("lastname"));
                userList.add(account);
            }
            return userList;
        });
    }
}

