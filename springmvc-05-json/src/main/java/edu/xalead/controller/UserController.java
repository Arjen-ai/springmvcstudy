package edu.xalead.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import edu.xalead.pojo.User;
import edu.xalead.utils.JsonUtils;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

//@Controller
@RestController //不走视图解析器
public class UserController {
    @RequestMapping(value = "/j1")
//    @ResponseBody //他就不走属兔解析器，直接返回一个字符串
    public String json1() throws JsonProcessingException {
        User user = new User(1,"李四",10);

        return JsonUtils.getJson(user);
    }


    @RequestMapping(value = "/j2")
//    @ResponseBody //他就不走属兔解析器，直接返回一个字符串
    public String json2() throws JsonProcessingException {

        //创建jackson核心ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        //不适用时间戳
//        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        objectMapper.setDateFormat(sdf);
        //util包
        Date date = new Date();

        String str = objectMapper.writeValueAsString(sdf.format(date));
        return str;
    }

    @RequestMapping(value = "/j3")
//    @ResponseBody //他就不走属兔解析器，直接返回一个字符串
    public String json3() throws JsonProcessingException {

        Date date = new Date();

        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }

    @RequestMapping(value = "/j4")
//    @ResponseBody //他就不走属兔解析器，直接返回一个字符串
    public String json4() throws JsonProcessingException {
        User user = new User(1,"李四",10);

        String str = JSON.toJSONString(user);
        return str;
    }

}
