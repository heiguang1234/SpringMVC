package com.hspedu.web.requestparam;

import com.hspedu.web.requestparam.entity.Master;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:Black Sunshine
 * Date:2025/2/12 15:26
 */
@RequestMapping("/vote")
@Controller
public class Votehandler {
    @RequestMapping(value = "/vote03")
    public String vote03(Master master){
        System.out.println(master);
        return "success";
    }
}
