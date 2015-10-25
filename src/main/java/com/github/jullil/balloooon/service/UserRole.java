package com.github.jullil.balloooon.service;

import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author jul
 */
public class UserRole implements GrantedAuthority {
    @Override
    public String getAuthority() {
        return "USER";
    }
}