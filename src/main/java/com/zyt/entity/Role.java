package com.zyt.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.List;

//@Data
//@Component
public class Role {

	private Integer rid;		//角色id
	private String rname;	//角色名
	
	private String createUser;	//创建者
	private Date createTime;	//创建时间
	private String updateUser;	//修改者
	private Date updateTime;	//修改时间
	
	private String by001;	//备用字段1
	private String by002;	//备用字段2
	private Integer by003;		//备用字段3
	private Date by004;		//备用字段4

	private List<Priv> lp;	//角色的菜单权限

	public Role() {
	}

	public Role(String rname) {
		this.rname = rname;
	}


	public Role(String rname, List<Priv> lp) {
		this.rname = rname;
		this.lp = lp;
	}

	public Role(Integer rid, String rname, List<Priv> lp) {
		this.rid = rid;
		this.rname = rname;
		this.lp = lp;
	}

	@Override
	public String toString() {
		return "Role{" +
				"rid=" + rid +
				", rname='" + rname + '\'' +
				", lp=" + lp +
				'}';
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getBy001() {
		return by001;
	}

	public void setBy001(String by001) {
		this.by001 = by001;
	}

	public String getBy002() {
		return by002;
	}

	public void setBy002(String by002) {
		this.by002 = by002;
	}

	public Integer getBy003() {
		return by003;
	}

	public void setBy003(Integer by003) {
		this.by003 = by003;
	}

	public Date getBy004() {
		return by004;
	}

	public void setBy004(Date by004) {
		this.by004 = by004;
	}

	public List<Priv> getLp() {
		return lp;
	}

	public void setLp(List<Priv> lp) {
		this.lp = lp;
	}
}
