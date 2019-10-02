package com.zyt.service;

import com.zyt.entity.Role;

import java.util.List;

public interface RoleService {
	/**
	 * 得到所有的角色，并将角色和角色所拥有的权限一一绑定
	 * @return
	 */
	public List<Role> showRole();

	/**
	 * 添加角色时同步添加角色的权限
	 * @param role
	 * @return
	 */
	public boolean insertRole(Role role);

	/**
	 * 根据rid删除角色并同步删除对应的权限
	 * @param rid
	 * @return
	 */
	public boolean deleteRoleByRid(int rid);

	/**
	 * 根据rid查询角色的信息进行回显
	 * @param rid
	 * @return
	 */
	public Role showRoleByRid(int rid);


	/**
	 * 修改角色的信息
	 * @param role
	 * @return
	 */
	public boolean updateRoleByRid(Role role);

}
