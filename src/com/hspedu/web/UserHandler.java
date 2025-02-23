package com.hspedu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author:Black Sunshine
 * Date:2025/2/11 11:08
 * 1 如果我们使用了springmvc 在一个类上标识@controller
 * 2 标识该类视为一个控制器 注入到容器
 * 3 比原声servlet开发简化很多
 */
@Controller
@RequestMapping("/user")
public class UserHandler {
     /**1 login方法是用于响应用户请求
      * 2 requestmapping类似我们以前在servlet中的url_pattern
      * 3 即当用户在浏览器中输入http://localhost:8080/web工程路径/login 就能访问到login()
      * 4 return login_ok 表示返回结果给视图解析器（internalResourceViewResolver）视图解析器回根据配置决定
      * 跳转到哪个页面
     */

    @RequestMapping("/login")
    public String login(){
        System.out.println("login_ok");
        return "login_ok";
    }
    @RequestMapping(value = "/buy")
    public String Buy(){
        System.out.println("购买商品");
        return "success";
    }
    @RequestMapping(value = "/find",params = "bookId=100",method = RequestMethod.GET)
    public String search(String bookId){
        System.out.println("查询书籍bookId="+bookId);
        return "success";
    }
    //两颗星表示多层路径
    @RequestMapping(value = "/message/**")
    public String im(){
        System.out.println("发送消息");
        return "success";
    }
    @RequestMapping(value = "/reg/{username}/{userid}")
    public String register(@PathVariable("username") String name,@PathVariable("userid") String id){
        System.out.println("接收到的参数-"+"username="+name+"--id--"+id);
        return "success";

    }
}
