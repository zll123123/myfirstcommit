package com.zyt.dao;

import com.zyt.entity.Admin;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface AdminDao {
	/**
	 * 根据用户名和密码查询管理员
	 * @return
	 */
	Admin selAdminByNP(Admin admin);
	/**
	 * 根据管理员的id修改密码
	 * @param admin
	 * @return
	 */
	int updAdminPwd(Admin admin);


	/**
	 * 修改个人的信息
	 * @param admin
	 * @return
	 */
	public int updAdminInfo(Admin admin);

	/**
	 * 查询所有的管理员信息
	 * @return
	 */
	public List<Admin> selAllAdmin();
}
