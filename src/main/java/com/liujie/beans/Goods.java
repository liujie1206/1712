package com.liujie.beans;

public class Goods {
	private Integer gid ;
	private String gname;
	private String ename;
	private Integer size;
	private double price;
	private Integer num;
	private String label;
	private String picture;
	private Brand brand;
	private Goodskind goodskind ;
	public Goods(Integer gid, String gname, String ename, Integer size, double price, Integer num, String label,
			String picture, Brand brand, Goodskind goodskind) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.ename = ename;
		this.size = size;
		this.price = price;
		this.num = num;
		this.label = label;
		this.picture = picture;
		this.brand = brand;
		this.goodskind = goodskind;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Goodskind getGoodskind() {
		return goodskind;
	}
	public void setGoodskind(Goodskind goodskind) {
		this.goodskind = goodskind;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", ename=" + ename + ", size=" + size + ", price=" + price
				+ ", num=" + num + ", label=" + label + ", picture=" + picture + ", brand=" + brand + ", goodskind="
				+ goodskind + "]";
	}

	
}
