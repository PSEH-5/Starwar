package com.starwars.api;


import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/starwars")
public interface StarwarsService {




    @GET
    @Path("/")
    @Consumes("application/json")
    @Produces("application/json")
    public Response getValue(@QueryParam("type") String type, @QueryParam("name") String name);

}
