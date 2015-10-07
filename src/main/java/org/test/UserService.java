package org.test;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.ejb.Singleton;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jul
 */
@Singleton
public class UserService {
    @NotNull
    private final Map<String, User> users = new HashMap<String, User>();

    public void addUser(@NotNull User user) {
        if (findUser(user.getLogin()) != null) {
            throw new IllegalArgumentException("User with such login exists");
        }
        users.put(user.getLogin(), user);
    }

    @Nullable
    public User findUser(@NotNull String login) {
        if (users.containsKey(login)) {
            return users.get(login);
        }
        return null;
    }

    public String encodePassword(@NotNull String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        final MessageDigest crypt = MessageDigest.getInstance("SHA-1");
        crypt.reset();
        crypt.update(password.getBytes("UTF-8"));
        return new BigInteger(1, crypt.digest()).toString(16);
    }

    @NotNull
    public Map<String, User> getUsers() {
        return users;
    }
}
