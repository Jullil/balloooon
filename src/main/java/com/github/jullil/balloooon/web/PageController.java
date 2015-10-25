package com.github.jullil.balloooon.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jul
 */
@Controller
public class PageController {
    @RequestMapping(value = {"/", "/index**"})
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/admin**")
    public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page!");
        model.setViewName("admin");
        return model;
    }

}
