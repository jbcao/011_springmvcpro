package b_datasubmit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 功能
 *
 * @author caojianbang
 * @date 17.8.22 3:11 PM
 */
@Controller
public class ReqAction {
    @RequestMapping(value = "/one",method = RequestMethod.GET)
    public String req(){
        System.out.println("我是处理get请求的。。。。");
        return "b_main";
    }
    @RequestMapping(value = "/req",method = RequestMethod.POST)
    public String req1(){
        System.out.println("我是处理post请求的。。。。");
        return "b_main";
    }
}
