package edu.xalead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {
    @PostMapping("/login")
        public String login(HttpSession session, String username, String password, Model model){
            session.setAttribute("userLoginInfo",username);
            model.addAttribute("username",username);
            return "main";
    }
    @RequestMapping("/goOut")
    public String login(HttpSession session,String username, String password){
        session.removeAttribute("userLoginInfo");
        return "login";
    }
    @GetMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("/goLogin")
    public String login(){
        return "login";
    }
}
