package com.domain.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/security")
public class SecurityController {

    @RequestMapping(value = "/login")
    public String login(@RequestParam(value = "error", required = false) String error, Model model) {

        System.out.println("error::::" + error);
        if (error != null) {
            return "login-failure";
        }

        return "security/login";
    }

//    @RequestMapping(value = "/checklogin" ,method = RequestMethod.POST)
//    public ModelAndView checklogin(HttpServletRequest httpServletRequest) {
//        ModelAndView mav = new ModelAndView();
//
//        mav.setViewName("redirect:/j_spring_security_check");
//
//        return mav;
//    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView home(HttpServletRequest httpServletRequest) {
        ModelAndView mav = new ModelAndView();

        mav.setViewName("security/success");
        return mav;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView test(HttpServletRequest httpServletRequest) {
        ModelAndView mav = new ModelAndView();

        mav.setViewName("security/test");
        return mav;
    }
}
