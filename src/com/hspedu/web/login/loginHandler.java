package com.hspedu.web.login;

import com.hspedu.web.login.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:Black Sunshine
 * Date:2025/2/14 10:46
 */
@Controller
@RequestMapping(value = "/login")
public class loginHandler {
    @RequestMapping(value = "/dologin")
    public String do_Login(User user){
        if (user.getName().equals("hsp")&&user.getPassword().equals("123")){
            return "forward:/login_ok.jsp";
        }else {
            return "forward:/login_error.jsp";
        }
    }
}
