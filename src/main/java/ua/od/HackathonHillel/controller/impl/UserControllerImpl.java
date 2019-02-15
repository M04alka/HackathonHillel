package ua.od.HackathonHillel.controller.impl;

import ua.od.HackathonHillel.controller.UserController;
import ua.od.HackathonHillel.dto.AccountDto;
import ua.od.HackathonHillel.dto.AdressDto;
import ua.od.HackathonHillel.service.AccountService;
import ua.od.HackathonHillel.service.GetAdressService;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("userinfo")
public class UserControllerImpl implements UserController {


    @POST
    @Path("get/{firstname}/{lastname}")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response loginUser(AccountDto user) {
        if(accountService.verifyUser(user))
        {
            return Response.ok().build();
        }
        else return Response.status(204).build() ;
    }

    public GetAdressService getAlladress;
    public AccountService accountService;

    @POST
    @Path("add")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response createNewUser(AccountDto user) {
        accountService.addNewUser(user);
        return Response.status(201).build();
    }

    @POST
    @Path("add/list")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<AdressDto> adressList() {
        List<AdressDto> listOfAdress = getAlladress.getAdress();
        return listOfAdress;
    }
}

