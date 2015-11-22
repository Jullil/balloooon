package com.github.jullil.balloooon.web;

import org.jetbrains.annotations.NotNull;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jul
 */
public class BaseController {
    protected ModelAndView renderView(@NotNull String partialName, @NotNull String title) {
        final ModelAndView view = new ModelAndView("layout");
        view.getModelMap().addAttribute("partialView", partialName);
        view.getModelMap().addAttribute("pageTitle", title);
        return view;
    }
}
