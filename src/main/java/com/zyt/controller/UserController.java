package com.zyt.controller;

import com.zyt.entity.Admin;
import com.zyt.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private Admin admin;
    @Autowired
    private AdminService adminService;

    @PutMapping("/updAdminPwd/{aid}")
    public String updAdminPwd(@PathVariable("aid")Integer aid,@RequestParam("newpwd")String apwd, Model model){
        admin.setAid(aid);
        admin.setApwd(apwd);

        boolean b = false;
        try {
            b = adminService.updAdminPwd(admin);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(!b){
            model.addAttribute("msg","修改失败");
            return "user/user_modi_pwd";
        }
        model.addAttribute("msg","修改成功");
        return "redirect:/login.jsp";
    }
}
