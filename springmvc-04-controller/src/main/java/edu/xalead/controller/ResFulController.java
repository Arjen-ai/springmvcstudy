package edu.xalead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResFulController {
    @GetMapping(value = "/add/{a}/{b}")
    public String test(@PathVariable int a,@PathVariable int b , Model model){
        int res = a+b;
        model.addAttribute("msg","a+b=" + res);
        return "test";
    }
}
