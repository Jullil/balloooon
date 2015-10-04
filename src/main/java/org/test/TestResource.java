package org.test;

import org.test.ejb.TestEjb;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by botanick on 04.10.15.
 */
@Path("test")
public class TestResource {

    @EJB
    private TestEjb testEjb;

    @GET
    public String test() {
        return testEjb.getAnswer();
    }
}