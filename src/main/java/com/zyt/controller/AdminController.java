package com.zyt.controller;

import com.zyt.entity.Admin;
import com.zyt.service.AdminService;
import com.zyt.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Collections;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private Admin admin;

    @Autowired
    private AdminService adminService;
    @Autowired
    private RoleService roleService;

    @PostMapping("/loginAction")
    public String loginAction(String username, String password, HttpSession session, Model model) {
        admin.setAcname(username);
        admin.setApwd(password);
        try {
            Admin admin1 = adminService.checkLogin(admin);

            if (admin1 == null) {
                model.addAttribute("msg", "用户名或密码错误");
                return "forward:/login.jsp";
            }
            session.setAttribute("admin",admin1);
            System.out.print(admin.getLr());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "index";
    }

    @RequestMapping("/exitAction")
    public String exitAction(HttpSession session){
        session.invalidate();
        return "redirect:/login.jsp";
    }
    @PostMapping("/addAdmin")
    public String addAdminAction(){
        return "admin/admin_add.jsp";
    }








}
