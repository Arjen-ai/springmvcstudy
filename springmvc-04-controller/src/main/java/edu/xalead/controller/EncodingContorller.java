package edu.xalead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class EncodingContorller {
    //过滤器解决乱码
    @RequestMapping("/test1")
    public String test(String name, Model model){

        System.out.println(name);
        model.addAttribute("msg",name);
        return "test";
    }
}
