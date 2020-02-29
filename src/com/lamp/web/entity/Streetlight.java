package com.lamp.web.entity;

import java.util.Date;

public class Streetlight {
	private Integer id;
	private String lampWick;//灯罩
	private String lampshade;//灯柱
	private String wire;//线缆
	private String supportingArm;//支撑臂
	private String screw;//螺钉
	private Date createdTime;//创建时间
	private Date modifiedTime;//修改时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLampWick() {
		return lampWick;
	}
	public void setLampWick(String lampWick) {
		this.lampWick = lampWick;
	}
	public String getLampshade() {
		return lampshade;
	}
	public void setLampshade(String lampshade) {
		this.lampshade = lampshade;
	}
	public String getWire() {
		return wire;
	}
	public void setWire(String wire) {
		this.wire = wire;
	}
	public String getSupportingArm() {
		return supportingArm;
	}
	public void setSupportingArm(String supportingArm) {
		this.supportingArm = supportingArm;
	}
	public String getScrew() {
		return screw;
	}
	public void setScrew(String screw) {
		this.screw = screw;
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
		return "Streetlight [id=" + id + ", lampWick=" + lampWick + ", lampshade=" + lampshade + ", wire=" + wire
				+ ", supportingArm=" + supportingArm + ", screw=" + screw + ", createdTime=" + createdTime + ", modifiedTime="
				+ modifiedTime + "]";
	}
	
}
