package com.zyt.controller;

import com.zyt.entity.Priv;
import com.zyt.entity.Role;
import com.zyt.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;


    @GetMapping("/roleList")
    public String roleList(Model model) {
        List<Role> roles = roleService.showRole();
        model.addAttribute("roles", roles);
        return "role/role_list";
    }

    @GetMapping("/updateRoleUIAction/{rid}")
    public String modiRoleUI(@PathVariable Integer rid, Model model) {
        Role role = roleService.showRoleByRid(rid);
        model.addAttribute("role", role);
        return "role/role_modi";
    }

    @PutMapping("/updateRoleAction")
    public String modiRole( Role role, HttpServletRequest request) {
        String[] pids = request.getParameterValues("pids");
        List<Priv> lp = new ArrayList<>();
        for (String pid : pids) {
            lp.add(new Priv(Integer.parseInt(pid)));
        }
        role.setLp(lp);
       boolean b=roleService.updateRoleByRid(role);
        return "redirect:/role/roleList";
    }

    @GetMapping("/deleteRoleAction/{rid}")
    public String deleRole(@PathVariable Integer rid, HttpServletRequest request) {
        boolean b = roleService.deleteRoleByRid(rid);
        System.out.println("b="+b);

        return "role/roleList";
    }

    @GetMapping("/showInsertRoleAction")
    public String showInsertRole() {
        return "role/role_add";
    }
    @PostMapping("insertRoleAction")
    public String insertRole(Role role,HttpServletRequest request){
        String[] pids=request.getParameterValues("pids");
        List<Priv>  privs=new ArrayList<>();
        for (String  lp:pids){
            privs.add(new Priv(Integer.parseInt(lp)));
            role.setLp(privs);
        }
        boolean  b=roleService.insertRole(role);
        return "redirect:/role/roleList";

    }
}
