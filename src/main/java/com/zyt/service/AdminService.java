package com.zyt.service;

import com.zyt.entity.Admin;
import com.zyt.entity.Role;

import java.util.List;

public interface AdminService {
	/**
	 * 检查用户输入的信息，登陆成功将用户和权限绑定
	 * @param admin
	 * @return
	 */
	public Admin checkLogin(Admin admin);
	/**
	 * 根据管理员的id修改密码
	 * @param admin
	 * @return
	 */
	public boolean updAdminPwd(Admin admin);

	public List<Role> selRoleByAid(int aid);
	/**
	 * 修改个人信息
	 * @param admin
	 * @return
	 */
	public boolean updAdminInfo(Admin admin);
}
