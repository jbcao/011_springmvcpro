package e_date.controller;

import e_date.pojo.Student;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 功能
 *
 * @author caojianbang
 * @date 23.8.22 9:44 PM
 */
@Controller
public class DateAction {
    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(sf,true));
    }
    //必须要添加mvc注解驱动
    @RequestMapping("/mydate")         //pattern只是检验前端传来的字符串的格式，正确后再进行注入
    public String mydate(@DateTimeFormat(pattern = "yyyy-MM-dd") Date mydate, HttpServletRequest request){
        System.out.println(mydate);
        System.out.println(sf.format(mydate));
        //requset中存入数据用于jsp展示
        request.setAttribute("mydate",sf.format(mydate));
        return "e_show";
    }


    @RequestMapping("/all")
    public String all(Date all){
        System.out.println(all);
        System.out.println(sf.format(all));
        return "e_show";
    }
 @RequestMapping("/collection")
    public String collection(HttpServletRequest request){
     List<Student> list = new ArrayList<>();
     try {
         //sf.format返回值是string,无法注入对象中，只能转成日期格式注入
         //只要是日期类型，样式都丑陋
         Student s1 = new Student("障碍",sf.parse("2009-9-8"));
         Student s2 = new Student("障碍",sf.parse("2009-9-8"));
         Student s3 = new Student("障碍",sf.parse("2009-9-8"));
         list.add(s1);
         list.add(s2);
         list.add(s3);
         request.setAttribute("list",list);
     } catch (ParseException e) {
         e.printStackTrace();
     }
     return "e_show";
    }
}
