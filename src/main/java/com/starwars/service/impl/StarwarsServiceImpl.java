package com.starwars.service.impl;

import com.starwars.api.StarwarsService;
import com.starwars.helper.Helper;
import com.starwars.helper.RequestValidator;
import com.starwars.planet.messages.StarwarsResponse;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.core.Response;

public class StarwarsServiceImpl implements StarwarsService {

    @Autowired
    private Helper helper;

    @Autowired
    private RequestValidator validator;



    @Override
    public Response getValue(String type, String name) {
        StarwarsResponse response = null;
        if (validator.validate(type, name) != null) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        try {
            response = helper.getAllSWAPIResponseByTypeName(type, name);
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
        if (response == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        return Response.ok().entity(response).build();
    }
}
