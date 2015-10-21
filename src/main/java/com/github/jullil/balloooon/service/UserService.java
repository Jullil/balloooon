package com.github.jullil.balloooon.service;

import com.github.jullil.balloooon.entity.User;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author jul
 */
@Service
public class UserService {
    private static final Logger logger = LogManager.getLogger(UserService.class);

    @Nullable
    public String encodePassword(@NotNull String password) {
        final MessageDigest crypt;
        try {
            crypt = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            logger.error("Operation encode password failed");
            return null;
        }
        crypt.reset();
        try {
            crypt.update(password.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            logger.error("Operation encode password failed");
            return null;
        }
        return new BigInteger(1, crypt.digest()).toString(16);
    }
}
