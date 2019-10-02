package com.zyt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {

    /*主页菜单*/
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /*角色管理菜单*/
    @RequestMapping("role")
    public String role(){
        return "redirect:/role/roleList";
    }

    /*个人信息菜单*/
    @RequestMapping("userinfo")
    public String userinfo(){
        return "user/user_info";
    }


    /*修改密码菜单*/
    @RequestMapping("/modi_pwd")
    public String modiPwd(){
        return "user/user_modi_pwd";

    }
    @RequestMapping("admin_list")
    public String  admin(){
        return "admin/admin_list";
    }

}
