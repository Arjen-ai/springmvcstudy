package edu.xalead.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //放行的判断
        HttpSession session = request.getSession();
        if(session.getAttribute("userLoginInfo") != null){
            return true;
        }

        if (request.getRequestURI().contains("Login") || request.getRequestURI().contains("login")){
            return true;
        }
        //什么情况是没有登陆的
        request.setAttribute("error","你还没登陆");
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}
