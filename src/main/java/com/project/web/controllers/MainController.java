package com.project.web.controllers;

import com.project.web.objects.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {

    //private static final Logger log = Logger.getLogger(MainController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getMainPage() {
        return "/resources/html/home.html";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getTestPage() {
        return "/resources/html/test.html";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView main(HttpSession session) {
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(session.getServletContext());
        return new ModelAndView("login", "user", new User());
    }

    @RequestMapping(value = "/check-user", method = RequestMethod.POST)
    public ModelAndView checkUser(@ModelAttribute("user") User user) {
        return new ModelAndView("main", "user", user);
    }

}