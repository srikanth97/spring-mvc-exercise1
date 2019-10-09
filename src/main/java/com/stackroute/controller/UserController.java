package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @RequestMapping("/displayUser")
    public  ModelAndView display(HttpServletRequest request, HttpServletResponse response){
        User user = new User();
        user.setName("srikanth");

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("user",user);

        return mv;
    }
}
