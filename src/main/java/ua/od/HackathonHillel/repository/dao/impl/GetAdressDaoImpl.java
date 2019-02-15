package ua.od.HackathonHillel.repository.dao.impl;



import ua.od.HackathonHillel.entity.AdressEntity;
import ua.od.HackathonHillel.repository.dao.GetAdressDao;
import ua.od.HackathonHillel.repository.helper.SqlHelper;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GetAdressDaoImpl implements GetAdressDao {

    private  static  String GET_ALL_ADRESS =
            "SELECT Adress.id as id," +
                    "Country.name as  country, " +
                    "City.name as city, " +
                    "Street.name as street\n" +
                    "FROM Adress\n" +
                    "INNER JOIN Country\n" +
                    "ON Adress.country_id = Country.id\n" +
                    "INNER JOIN City\n" +
                    "ON Adress.city_id = City.id\n" +
                    "INNER JOIN Street\n" +
                    "ON Adress.street_id = Street.id;";


    public List<AdressEntity> getAdress() {
        return SqlHelper.prepareStatement(GET_ALL_ADRESS, statement-> {
            ResultSet resultSet = statement.executeQuery();
            List<AdressEntity> adressList = new ArrayList<>();
            while(resultSet.next()){
                AdressEntity adress = new AdressEntity();
                adress.setId(resultSet.getInt("id"));
                adress.setCountry(resultSet.getString("country"));
                adress.setCities(resultSet.getString("city"));
                adress.setStreets(resultSet.getString("string"));
                adressList.add(adress);
            }
            return adressList;
        });

    }

}
