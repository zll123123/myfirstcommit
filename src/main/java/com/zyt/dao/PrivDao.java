package com.zyt.dao;

import com.zyt.entity.Priv;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface PrivDao {
	/**
	 * 通过管理员id获得管理员所有的权限
	 * @param aid
	 * @return
	 */
	public List<Priv> selPrivByAid(int aid);
	/**
	 * 通过角色id获得角色所有的权限
	 * @param rid
	 * @return
	 */
	public List<Priv> selPrivByRid(int rid);

	/**
	 * 删除角色的同时删除角色权限表
	 * @param rid
	 * @return
	 */
	public int delPrivByRid(int rid);
}
