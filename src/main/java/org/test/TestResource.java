package org.test;

import org.test.ejb.TestEjb;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/")
public class TestResource {

    @EJB
    private TestEjb testEjb;

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