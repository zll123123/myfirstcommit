package com.zyt.dao;

import com.zyt.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface RoleDao {

	/**
	 * 查询所有的角色
	 * @return
	 */
	public List<Role> selAllRole();

	/**
	 * 根据aid查询对应的角色信息
	 * @param aid
	 * @return
	 */
	public List<Role> selRoleByAid(int aid);

	/**
	 * 添加角色
	 * @param role
	 * @return
	 */
	public int insertRole(Role role);

	/**
	 * 根据角色名查询角色
	 * @param role
	 * @return
	 */
	public Role selRoleByRname(Role role);

	/**
	 * 添加角色时同步添加角色的权限
	 * @param rid
	 * @param pid
	 * @return
	 */
	public int insertRoPr(@Param("rid") int rid,@Param("pid") int pid);

	/**
	 * 根据角色的id删除角色并删除角色对应的权限
	 * @param rid
	 * @return
	 */
	public int delRoleByRid(int rid);

	/**
	 * 根据角色的id查询角色的信息
	 * @param rid
	 * @return
	 */
	public Role selRoleByRid(int rid);

	/**
	 * 根据rid修改Role的信息
	 * @param role
	 * @return
	 */
	public int updateRoleByRid(@Param("role") Role role);

	/**
	 * 修改信息时先删后加
	 * @param rid
	 * @return
	 */
	public int delRoPrByRid(int rid);
	

}
