package com.lamp.web.entity;

import java.util.Date;

public class Road {
	private Integer id;
	private String roadSection;//路段
	private String area;//所属地区
	private Integer length;//长度
	private Integer needLightNumber;//所需路灯数量
	private String installCompany;//安装公司
	private Date createdTime;//创建时间
	private Date modifiedTime;//修改时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoadSection() {
		return roadSection;
	}
	public void setRoadSection(String roadSection) {
		this.roadSection = roadSection;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getNeedLightNumber() {
		return needLightNumber;
	}
	public void setNeedLightNumber(Integer needLightNumber) {
		this.needLightNumber = needLightNumber;
	}
	public String getInstallCompany() {
		return installCompany;
	}
	public void setInstallCompany(String installCompany) {
		this.installCompany = installCompany;
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
		return "Road [id=" + id + ", roadSection=" + roadSection + ", area=" + area + ", length=" + length
				+ ", needLightNumber=" + needLightNumber + ", installCompany=" + installCompany + ", createdTime="
				+ createdTime + ", modifiedTime=" + modifiedTime + "]";
	}
	
}
