package b_datasubmit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * 功能 5种数据提交方式处理器
 *
 * @author caojianbang
 * @date 17.8.22 4:36 PM
 */
@Controller
@RequestMapping("/sub")
public class DataSubmitAction {
    @RequestMapping("/one")
    public  String one(String myname,Integer age){
        System.out.println("myname+"+myname+"age is: "+(age+1));
        return "b_main";
    }
    @RequestMapping("/two")
    public  String one(User u){
        System.out.println(u.toString());
        return "b_main";
    }
    @RequestMapping("/three/{uname}/{uage}")
    public String three(@PathVariable("uname") String name, @PathVariable("uage") int age){
        System.out.println("name :"+name+" age :"+age);
        return "b_main";
    }
    @RequestMapping("/four")
    public String four(@RequestParam("name") String uname, @RequestParam("age") String uage){
        System.out.println("name :"+uname+" age :"+uage);
        return "b_main";
    }
    @RequestMapping("/five")
    public String four(HttpServletRequest request){
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println("name :"+name+" age :"+age);
        return "b_main";
    }
}
