package org.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by botanick on 04.10.15.
 */
@Path("test")
public class TestResource {

    @GET
    public String test() {
        return "Working";
    }
}