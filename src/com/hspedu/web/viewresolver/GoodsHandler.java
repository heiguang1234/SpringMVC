package com.hspedu.web.viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:Black Sunshine
 * Date:2025/2/13 19:57
 */
@RequestMapping(value = "/goods")
@Controller
public class GoodsHandler {
    @RequestMapping("/buy")
    public String buy(){
        System.out.println("----buy----");
        return "my_view";//转给自己自定义视图名
    }
}
