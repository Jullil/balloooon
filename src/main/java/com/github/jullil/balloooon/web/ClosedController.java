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
public class ClosedController {

    @RequestMapping(value = "/admin**")
    public ModelAndView adminPage() {
        final ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page!");
        model.setViewName("admin");
        return model;
    }

}
