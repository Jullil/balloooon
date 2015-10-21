package com.github.jullil.balloooon.web;

import com.github.jullil.balloooon.repository.UserRepository;
import com.github.jullil.balloooon.service.UserService;
import com.github.jullil.balloooon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.*;
import java.util.Optional;

/**
 * @author jul
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("sign-up")
    public String signUp() {
        return "signup";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> signUp(@FormParam("login") String login,
                                    @FormParam("password") String password,
                                    @FormParam("email") String email,
                                    @FormParam("firstName") String firstName) {
        if (login == null || password == null) {
            throw new WebApplicationException("Please, specify login and password");
        }
        final User user = new User("", login);
        user.setPassword(userService.encodePassword(password));
        user.setFirstName(firstName);
        user.setEmail(email);
        userRepository.save(user);
        return ResponseEntity.ok("Congratulation! You've successfully signed up");
    }

    @RequestMapping("sign-in")
    public String signIn() {
        return "signin";
    }

    @RequestMapping(value = "sign-in", method = RequestMethod.POST)
    public ResponseEntity<?> signIn(@FormParam("login") String login, @FormParam("password") String password) {

        final Optional<User> user = userRepository.findByLoginAndPassword(login, userService.encodePassword(password));
        if (!user.isPresent()) {
            return new ResponseEntity<>("Login or password is incorrect", HttpStatus.FORBIDDEN);
        }
        return ResponseEntity.ok("You've successfully signed in");
    }
}
