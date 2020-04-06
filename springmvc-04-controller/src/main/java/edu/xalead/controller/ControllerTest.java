package edu.xalead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest {

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","testSpringMvc");
        return "test";
    }

}
