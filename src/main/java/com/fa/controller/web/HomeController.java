package com.fa.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    private ModelAndView modelAndView;
    @RequestMapping(value = {"/trang-chu"}, method = RequestMethod.GET)
    public ModelAndView homePage(){
         modelAndView = new ModelAndView("web/home");
        return modelAndView;
    }

    @RequestMapping(value = {"/room"}, method = RequestMethod.GET)
    public ModelAndView room(){
         modelAndView = new ModelAndView("web/room");
        return modelAndView;
    }
    @RequestMapping(value = {"/about-us"}, method = RequestMethod.GET)
    public ModelAndView AboutUs(){
        modelAndView = new ModelAndView("web/about");
        return modelAndView;
    }
    @RequestMapping(value = {"/blog"}, method = RequestMethod.GET)
    public ModelAndView blog(){
        modelAndView = new ModelAndView("web/blog");
        return  modelAndView;
    }
    @RequestMapping(value = {"/contact"}, method = RequestMethod.GET)
    public ModelAndView contact(){
        modelAndView = new ModelAndView("web/contact");
        return modelAndView;
    }

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String indexHome(){
        return "redirect:trang-chu";
    }
}
