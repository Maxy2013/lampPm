package com.lamp.web.entity;

import java.util.Date;

public class Road {
	private Integer id;
	private String roadSection;//路段
	private String area;//所属地区
	private Integer length;//长度
	private Integer needLightNumber;//所需路灯数量
	private String install_company;//安装公司
	private Date createTime;//创建时间
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
	public String getInstall_company() {
		return install_company;
	}
	public void setInstall_company(String install_company) {
		this.install_company = install_company;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
				+ ", needLightNumber=" + needLightNumber + ", install_company=" + install_company + ", createTime="
				+ createTime + ", modifiedTime=" + modifiedTime + "]";
	}
	
}
