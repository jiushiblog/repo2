package com.shenyu.entity;

public class Items {
	private int id;
	private String name;
	private String detail;
	private double price;
	
	
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", detail=" + detail + ", price=" + price + ", pic=" + pic
				+ ", createTime=" + createTime + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	private String pic;
	private String createTime;
	
	
	
	

}
