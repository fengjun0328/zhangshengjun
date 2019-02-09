package cn.bdqn.controller;

import cn.bdqn.pojo.User;
import cn.bdqn.service.Userservice;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 用户的控制层
 */
@Controller
public class Usercontroller {

    //注入主键
    @Resource
    private Userservice userservice;

    @RequestMapping("claim_voucher_edit.html")
    public String claim_voucher_edit(){
        return "claim_voucher_edit";
    };

    @RequestMapping("index.html")
    public String index(){
        return "index";
    };


    @RequestMapping("login.html")
    public String login(){
        return "login";
    }

    @RequestMapping("dologin.html")
    public String dologin(int sn, String password, HttpServletRequest request,Model model){
        User users=userservice.findUser(sn,password);

        if(users!=null){
            //把用户存进去,带入到页面提示中去
            request.getSession().setAttribute("User",users);

            System.out.println("登入用户不为空-------------------"+users.getName()+users.getName_cn());
            return "index";
        }else{
            model.addAttribute("message","用户名或密码错误!");
            //System.out.println("错误分支------------");
            //System.out.println("为否用户信息:"+users.getName());
            return "login";
        }


    };


}
