package com.lamp.web.entity;

import java.util.Date;

//公司信息
public class Company {
	private Integer id;
	private String companyUnicode;//公司编码
	private String companyName;//公司名称
	private String address;//地址
	private Date createdTime;//创建时间
	private Date modifiedTime;//修改时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyUnicode() {
		return companyUnicode;
	}
	public void setCompanyUnicode(String companyUnicode) {
		this.companyUnicode = companyUnicode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	@Override
	public String toString() {
		return "company [id=" + id + ", companyUnicode=" + companyUnicode + ", companyName=" + companyName
				+ ", address=" + address + ", createdTime=" + createdTime + ", modifiedTime=" + modifiedTime + "]";
	}
	
}
