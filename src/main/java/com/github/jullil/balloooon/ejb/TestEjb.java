package com.github.jullil.balloooon.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@LocalBean
@Stateless
public class TestEjb {
    public String getAnswer() {
        return "42";
    }
}
