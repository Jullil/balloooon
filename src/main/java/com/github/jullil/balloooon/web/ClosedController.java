package com.github.jullil.balloooon.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jul
 */
@Controller
@PreAuthorize("hasRole('USER')")
public class ClosedController extends BaseController {

    @RequestMapping(value = "/admin**")
    public ModelAndView adminPage() {
        return renderView("admin", "Spring Security Hello World");
    }

}
