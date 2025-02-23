package com.hspedu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author:Black Sunshine
 * Date:2025/2/11 22:12
 */
@Controller
public class ComputerHandler {
    @RequestMapping(value = "/computer",method = RequestMethod.POST)
    public String query(String brand,float price,int number){
        System.out.println("品牌="+brand+"价格="+price+"数量="+number);
        return "success";
    }
}
