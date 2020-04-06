package edu.xalead.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//定义拦截器
public class MyInterceptor implements HandlerInterceptor {

    //return true 执行下一个拦截器，放行
    //return false 不执行下一个拦截器，拦截
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("===============处理前=============");
        return true;
    }
}
