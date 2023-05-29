package f_webinf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 功能
 *
 * @author caojianbang
 * @date 25.8.22 3:13 PM
 */
@Controller
public class WebInfAction {

    @RequestMapping("/showIndex")
    public String showIndex() {
        return "f-index";
    }

    @RequestMapping("/showMain")
    public String showMain() {
        return "f-main";
    }

    @RequestMapping("/showLogin")
    public String showLogin() {
        return "f-login";
    }

    @RequestMapping("/login")
    public String login(String name, String pass, HttpServletRequest request) {
        if (name.equalsIgnoreCase("cjb") && pass.equalsIgnoreCase("pass")) {
            //获取session,并存入永华信息
            request.getSession().setAttribute("user",name);
            return "f-main";
        } else {
            request.setAttribute("msg", "用户名或密码错误");
            return "f-login";
        }
    }
}
