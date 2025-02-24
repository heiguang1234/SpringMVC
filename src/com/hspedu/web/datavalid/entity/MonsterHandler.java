package com.hspedu.web.datavalid.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Author:Black Sunshine
 * Date:2025/2/22 21:48
 */
@Controller
//每次请求一个monsterhandler都会生成一个新的对象
@Scope(value = "prototype")
public class MonsterHandler {
     /**
     @Param: 当我们向map添加数据时 会默认存放到request域中
     */
     @RequestMapping(value = "/addMonsterUI")
    public String addMonsterUI(Map<String,Object> map) {
        map.put("monster",new Monster());
        return "data_valid/monster_addUI";
    }
     /**
      * 编写方法 处理添加妖怪
      * springmvc可以将提交的数据 按照参数名和对象的属性名陪陪
      * 直接封装到对象中
      * @Valid Monster monster 表示将对monster接受的数据进行校验
      * Errors errors 表示如果校验出现错误 将校验的信息保存到errors中
      * map 表示如果校验出错 将校验的信息保存到map并同时保存monster对象
      * */

    @RequestMapping(value = "/save")
    public String save(@Valid Monster monster, Errors errors, Map<String,Object> map){
        System.out.println("---monster---"+monster);
        System.out.println("====map===");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("key="+entry.getKey()+"value="+entry.getValue());
        }
        System.out.println("===errors===");
        if (errors.hasErrors()){
            List<ObjectError> allErrors = errors.getAllErrors();
            for (ObjectError allError : allErrors) {
                System.out.println("error="+allError);
            }
            return "data_valid/monster_addUI";
        }
        return "data_valid/success";

    }
    //取消绑定monster的name
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){

        webDataBinder.setDisallowedFields("name");
    }
}
