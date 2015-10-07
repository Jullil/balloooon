package org.test;

import javax.ejb.EJB;
import javax.ws.rs.*;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * @author jul
 */
@Path("user")
public class UserResource {

    @EJB
    private UserService userService;

    @GET
    @Path("sign-up")
    public String signUp() {
        return "Sign up form";
    }

    @POST
    @Path("sign-up")
    public String signUp(@FormParam("login") String login, @FormParam("password") String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        if (login == null || password == null) {
            throw new WebApplicationException("Please, specify login and password");
        }
        userService.addUser(new User(login, userService.encodePassword(password)));
        return "Congratulation! You've successfully signed up";
    }

    @GET
    @Path("sign-in")
    public String signIn() {
        return "Sign in form";
    }

    @Path("sign-in")
    @POST
    public String signIn(@FormParam("login") String login, @FormParam("password") String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        final User user = userService.findUser(login);
        if (user != null && user.getPassword().equals(userService.encodePassword(password))) {
            return "You've successfully signed in";
        }
        return "Login or password is incorrect";
    }
}
