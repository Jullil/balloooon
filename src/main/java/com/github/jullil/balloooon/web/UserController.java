package com.github.jullil.balloooon.web;

import com.github.jullil.balloooon.service.UserService;
import com.github.jullil.balloooon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.*;

/**
 * @author jul
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("sign-up")
    public ResponseEntity<?> signUp() {
        return ResponseEntity.ok("Sign up form");
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> signUp(@FormParam("login") String login, @FormParam("password") String password) {
        if (login == null || password == null) {
            throw new WebApplicationException("Please, specify login and password");
        }
        userService.addUser(new User("", login), password);
        return ResponseEntity.ok("Congratulation! You've successfully signed up");
    }

    @RequestMapping("sign-in")
    public ResponseEntity<?> signIn() {
        return ResponseEntity.ok("Sign in form");
    }

    @RequestMapping(value = "sign-in", method = RequestMethod.POST)
    public ResponseEntity<?> signIn(@FormParam("login") String login, @FormParam("password") String password) {
        final User user = userService.getUser(login, password);
        if (user == null) {
            return new ResponseEntity<>("Login or password is incorrect", HttpStatus.FORBIDDEN);
        }
        return ResponseEntity.ok("You've successfully signed in");
    }
}
