package com.mycompany.mypizza.dto;

public class Lowoption {
	private String hcode;
	private String lcode;
	private String lname;
	private int price;
	public Lowoption() {
		super();
	}
	public Lowoption(String hcode, String lcode, String lname, int price) {
		super();
		this.hcode = hcode;
		this.lcode = lcode;
		this.lname = lname;
		this.price = price;
	}
	public String getHcode() {
		return hcode;
	}
	public void setHcode(String hcode) {
		this.hcode = hcode;
	}
	public String getLcode() {
		return lcode;
	}
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Lowoption [hcode=" + hcode + ", lcode=" + lcode + ", lname=" + lname + ", price=" + price + "]";
	}

	
}
