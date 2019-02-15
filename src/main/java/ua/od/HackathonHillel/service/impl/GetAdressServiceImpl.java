package ua.od.HackathonHillel.service.impl;

import ua.od.HackathonHillel.dto.AdressDto;
import ua.od.HackathonHillel.repository.dao.GetAdressDao;
import ua.od.HackathonHillel.repository.dao.impl.GetAdressDaoImpl;
import ua.od.HackathonHillel.service.GetAdressService;

import java.util.ArrayList;
import java.util.List;

public class GetAdressServiceImpl implements GetAdressService {

    private GetAdressDao getAdressDao;

    @Override
    public List<AdressDto> getAdress() {
        getAdressDao = new GetAdressDaoImpl();
        List<AdressDto> adressList = new ArrayList<>();
        getAdressDao.getAdress().forEach(adressEntity -> {
            adressList.add(new AdressDto(){{
                setId(adressEntity.getId());
                setCountry(adressEntity.getCountry());
                setCities(adressEntity.getCities());
                setStreets(adressEntity.getStreets());
            }});
        });
        return adressList;
    }

}