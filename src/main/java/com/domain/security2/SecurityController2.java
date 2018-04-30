package com.domain.security2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/security2")
public class SecurityController2 {

    @RequestMapping(value = "/login")
    public String login(@RequestParam(value = "error", required = false) String error, Model model) {


        if (error != null) {
            return "login-failure";
        }
        return "security/login";
    }
}
