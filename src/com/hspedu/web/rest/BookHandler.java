package com.hspedu.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author:Black Sunshine
 * Date:2025/2/12 13:36
 */
@RequestMapping("/user")
@Controller
public class BookHandler {
    @RequestMapping(value = "/book/{id}")
    public String Book(@PathVariable("id") String bookID){
        System.out.println("查询的bookid="+bookID);
        return "success";
    }
    @PostMapping(value = "/book")
    public String addBook(String bookName){
        System.out.println("增加的书籍名字="+bookName);
        return "success";
    }
    @RequestMapping(value = "/book/{id}",method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable("id") String bookID){
        System.out.println("删除的bookid="+bookID);
        return "redirect:/user/success";
    }
    //return "success" 如果这样返回回报错jsp only get post or head
    //1.redirect:/user/success重定向
    //2.会被解析成/springmvc/user/success

    //如果请求是/user/success，就转发到success.jsp
    // successGenenal对应的url是http://ip:port/springmvc/user/success
    @RequestMapping("/success")
    public String successGenenal(){
        return "success";
    }
}
