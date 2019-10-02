package com.zyt.service.impl;

import com.zyt.entity.Priv;
import com.zyt.entity.Role;
import com.zyt.dao.PrivDao;
import com.zyt.dao.RoleDao;
import com.zyt.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	int i;

	@Autowired
	private RoleDao roleDao;
	@Autowired
	private PrivDao privDao;

	@Override
	public List<Role> showRole() {
		List<Role> lr = roleDao.selAllRole();
		for (Role role : lr) {
			List<Priv> lp = privDao.selPrivByRid(role.getRid());
			role.setLp(lp);
		}
		return lr;
	}

	@Override
	public boolean insertRole(Role role) {
		i = roleDao.insertRole(role);
		int j;
		Role role1 = roleDao.selRoleByRname(role);
		List<Priv> lp = role.getLp();
		for (Priv priv : lp) {
			 j= roleDao.insertRoPr(role1.getRid(), priv.getPid());
		}
		if(i > 0){
			return true;
		}
		return false;
	}

	@Override
	public boolean    deleteRoleByRid(int rid) {
		i = roleDao.delRoleByRid(rid);
		System.out.println("i="+i);
		int j = privDao.delPrivByRid(rid);
		System.out.println("j="+j);
		return i > 0 && j > 0 ? true : false;
	}

	@Override
	public Role showRoleByRid(int rid) {

		Role role = roleDao.selRoleByRid(rid);
		List<Priv> lp = privDao.selPrivByRid(rid);
		role.setLp(lp);
		return role;
	}

	@Override
	public boolean updateRoleByRid(Role role) {
		i = roleDao.updateRoleByRid(role);
		int j = roleDao.delRoPrByRid(role.getRid());
		int k = 0;
		for (Priv priv : role.getLp()) {
			k = roleDao.insertRoPr(role.getRid(), priv.getPid());
		}
		return i > 0 && j > 0 && k > 0 ? true : false;
	}


}
