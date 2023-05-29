package a_firstexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能
 *
 * @author caojianbang
 * @date 16.8.22 10:59 PM
 */
@Controller
public class DemoAction {
    @RequestMapping("/demo") //声明一个访问的路径
    public String demo(){
        System.out.println("服务器被访问到了。。。。");
        return "a_main";
    }
}
