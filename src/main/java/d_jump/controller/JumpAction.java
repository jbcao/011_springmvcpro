package d_jump.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能
 *
 * @author caojianbang
 * @date 19.8.22 3:58 PM
 */
@Controller
@RequestMapping("/jump")
public class JumpAction {
    @RequestMapping("/one")
    public String one() {
        System.out.println("转发到页面");
        return "d_main";//默认使用请求转发，使用视图解析器拼接前缀后缀进行页面跳转
    }

    @RequestMapping("/two")
    public String two() {
        return "forward:/other.action";
    }
    @RequestMapping("/three")
    public String three(){
        System.out.println("重定向页面");
        return "redirect:/admin/d_main.jsp";
    }
    @RequestMapping("/four")
    public String four(){
        System.out.println("重定向到action");
        return "redirect:/other.action";
    }
    @RequestMapping("/five")
    public String five(){
        System.out.println("这里随便跳");
        return "forward:/fore/d_login.jsp";
    }
}
