package org.test;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/")
public class TestResource {

    @GET
    @Path("test-get")
    public String testGet() {
        return "GET is working";
    }

    @POST
    @Path("test-post")
    public String testPost() {
        return "POST is working";
    }
}