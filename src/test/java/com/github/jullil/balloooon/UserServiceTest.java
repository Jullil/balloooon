package com.github.jullil.balloooon;

import com.github.jullil.balloooon.ejb.UserService;
import com.github.jullil.balloooon.entity.User;
import junit.framework.TestCase;

import javax.ejb.EJB;

/**
 * @author jul
 */
public class UserServiceTest extends TestCase {
    @EJB
    private UserService userService;

    public void testAddUser() {
        userService.addUser(new User("Test User", "test_user"), "123");
    }
}
