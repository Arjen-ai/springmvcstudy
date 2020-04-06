package edu.xalead.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }
    @RequestMapping("/a1")
    public String test1(String username, HttpServletResponse response) throws IOException {
        if("admin".equals("张三")){
            return "true";
        }else{
            return "false";
        }
    }
}
