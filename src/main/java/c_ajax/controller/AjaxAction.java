package c_ajax.controller;

import c_ajax.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能
 *
 * @author caojianbang
 * @date 19.8.22 12:56 AM
 */
@Controller
@RequestMapping("/ajax")
public class AjaxAction {
    @ResponseBody   //用来处理ajax请求
    @RequestMapping("/list")
    public List<Student> ajax() {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 90);
        Student s2 = new Student("李四", 90);
        Student s3 = new Student("王五", 90);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        return list;//springmvc隐式转化成json数组
    }
    @ResponseBody   //用来处理ajax请求
    @RequestMapping("/list2")
    public Integer ajax2() {
        return 2;//springmvc隐式转化成json数组
    }@ResponseBody   //用来处理ajax请求
    @RequestMapping("/list3")
    public String ajax3() {
        return "jj";//springmvc隐式转化成json数组
    }
}
