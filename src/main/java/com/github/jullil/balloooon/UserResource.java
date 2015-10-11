package com.github.jullil.balloooon;

import com.github.jullil.balloooon.ejb.UserService;
import com.github.jullil.balloooon.entity.User;

import javax.ejb.EJB;
import javax.ws.rs.*;

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
    public String signUp(@FormParam("login") String login, @FormParam("password") String password) {
        if (login == null || password == null) {
            throw new WebApplicationException("Please, specify login and password");
        }
        userService.addUser(new User("", login), password);
        return "Congratulation! You've successfully signed up";
    }

    @GET
    @Path("sign-in")
    public String signIn() {
        return "Sign in form";
    }

    @Path("sign-in")
    @POST
    public String signIn(@FormParam("login") String login, @FormParam("password") String password) {
        final User user = userService.getUser(login, password);
        if (user == null) {
            return "Login or password is incorrect";
        }
        return "You've successfully signed in";
    }
}
