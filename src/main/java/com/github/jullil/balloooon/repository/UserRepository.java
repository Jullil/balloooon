package com.github.jullil.balloooon.repository;

import com.github.jullil.balloooon.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;

/**
 * @author jul
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @NotNull
    Optional<User> findByLoginAndPassword(@NotNull String login, @Nullable String encodedPassword);
}
