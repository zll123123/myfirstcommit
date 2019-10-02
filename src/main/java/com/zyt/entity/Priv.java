package com.zyt.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Data@Component
public class Priv {

	private int pid;		//菜单权限id
	private String pclass;	//菜单权限属性
	private String purl;	//菜单权限地址
	
	private String createUser;	//创建者
	private Date createTime;	//创建时间
	private String updateUser;	//修改者
	private Date updateTime;	//修改时间
	
	private String by001;	//备用字段1
	private String by002;	//备用字段2
	private int by003;		//备用字段3
	private Date by004;		//备用字段4

	public Priv() {
	}

	public Priv(int pid) {
		this.pid = pid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPclass() {
		return pclass;
	}

	public void setPclass(String pclass) {
		this.pclass = pclass;
	}

	public String getPurl() {
		return purl;
	}

	public void setPurl(String purl) {
		this.purl = purl;
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

	public int getBy003() {
		return by003;
	}

	public void setBy003(int by003) {
		this.by003 = by003;
	}

	public Date getBy004() {
		return by004;
	}

	public void setBy004(Date by004) {
		this.by004 = by004;
	}
}
