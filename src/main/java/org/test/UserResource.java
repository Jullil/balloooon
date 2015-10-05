package org.test;

import javax.ws.rs.*;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * @author jul
 */
@Path("user")
public class UserResource {

    @GET
    @Path("sign-up")
    public String signUp() {
        return "Sign up form";
    }

    @POST
    @Path("sign-up")
    public String signUp(@FormParam("login") String login, @FormParam("password") String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        UserService.addUser(new User(login, UserService.encodePassword(password)));
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
        final User user = UserService.findUser(login);
        if (user != null && user.getPassword().equals(UserService.encodePassword(password))) {
            return "You've successfully signed in";
        }
        return "Login or password is incorrect";
    }
}
