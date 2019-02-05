package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户的控制层
 */
@Controller
public class Usercontroller {

    @RequestMapping("index.html")
    public String index(){
        return "index";
    };


    @RequestMapping("login.html")
    public String login(String sn,String password){


        return "index";
    };


}
