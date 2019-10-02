package com.zyt.service.impl;

import com.zyt.entity.Admin;
import com.zyt.entity.Role;
import com.zyt.dao.AdminDao;
import com.zyt.dao.PrivDao;
import com.zyt.dao.RoleDao;
import com.zyt.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;
	@Autowired
	private PrivDao privDao;
	@Autowired
	private RoleDao roleDao;

	@Override
	public Admin checkLogin(Admin admin) {
		Admin admin1 = adminDao.selAdminByNP(admin);
		
		return admin1;
	}


	@Override
	public boolean updAdminPwd(Admin admin) {
		int i = adminDao.updAdminPwd(admin);
		if(i > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<Role> selRoleByAid(int aid) {
		List<Role> lr = roleDao.selRoleByAid(aid);
		return lr;
	}

	@Override
	public boolean updAdminInfo(Admin admin) {

		int i = adminDao.updAdminInfo(admin);
		if(i > 0){
			return true;
		}
		return false;
	}
}
