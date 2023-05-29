package d_jump.controller;

import d_jump.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 功能
 *
 * @author caojianbang
 * @date 23.8.22 4:26 PM
 */
@Controller
public class DataAction {
    @RequestMapping("/data")    //默认参数类型
    public String data(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model, Map map, ModelMap modelMap){
        //创建一个实体数据，传递到d_main.jsp页面上
        User user = new User("zhangsan",90);


        //传递数据
        request.setAttribute("requestUser",user);
        session.setAttribute("sessionUser",user);
        model.addAttribute("modelUser",user);
        map.put("mapUser",user);
        modelMap.addAttribute("modelmapUser",user);


        return "d_main";
    }
}
