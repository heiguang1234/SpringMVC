package com.hspedu.web.viewresolver;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

import java.util.Map;

/**
 * Author:Black Sunshine
 * Date:2025/2/13 19:57
 */
@Component(value = "my_view")
public class MyView extends AbstractView {
    @Override
    protected void renderMergedOutputModel(Map<String, Object> map, javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        //完成视图渲染
        //并且可以确定我们要跳转的页面【请求转发】WEB-INF/pages/my_view.jsp
        System.out.println("进入到自己的视图");

        //1.下面就是进行请求转发WEB-INF/pages/my_view.jsp
        //2.VEB-INF/pages/my_view.jsp就会被springmvc解析
        httpServletRequest.getRequestDispatcher("/WEB-INF/pages/my_view.jsp").forward(httpServletRequest,httpServletResponse);
    }
}
