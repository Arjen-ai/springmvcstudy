package edu.xalead.controller;

import edu.xalead.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    public String test1(@RequestParam("name") String name, Model model) {
        //1. 接收前端参数
        System.out.println("接收到前端参数为" + name);
        //2.将结果返回到前端， Model
        model.addAttribute("msg", name);
        return "test";
    }

    //前端接受的shi是对象
    @GetMapping("t2")
    public String test2(User user){
        System.out.println(user);

        return "test";
    }
}
