package org.test.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Created by botanick on 04.10.15.
 */
@LocalBean
@Stateless
public class TestEjb {
    public String getAnswer() {
        return "42";
    }
}
