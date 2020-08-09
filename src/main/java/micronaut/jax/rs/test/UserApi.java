package com.owennewburn.generated.api;

import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.micronaut.http.annotation.PathVariable;
import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/user")
@Api(description = "the user API")
public class UserApi {

    @GET
    @Path("/{user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Fetch a User by ID", notes = "", tags={ "user" })
    String getUser(@PathParam("user_id") @ApiParam("UUID of the user to fetch") UUID userId){
        throw new RuntimeException("Not Implemented");
    }
}
