package org.casco.hospital.external.rest.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

@Consumes()
@Produces()
@Path("area")
public class AreaController {

    @GET
    @Path("{idArea}")
    public Response getAreaById(@PathParam("idArea") Integer idArea) {
        return null;
    }
}
