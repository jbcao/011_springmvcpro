package d_jump.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能
 *
 * @author caojianbang
 * @date 19.8.22 4:12 PM
 */
@Controller
public class OtherAction {
    @RequestMapping("/other")
    public String other(){
        return "d_main";
    }
}
