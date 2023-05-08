package com.example.demo.pojoclass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Booking")
public class pojo {
	@Id
	@Column(name="B-id")
	private int bookingid;
	@Column(name="B-name")
	private String busname;
	@Column(name="B-no")
	private int busnumber;
	@Column(name="D-no")
	private int driverno;
	@Column(name="B-price")
	private int price;
	
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getBusname() {
		return busname;
	}
	public void setBusname(String busname) {
		this.busname = busname;
	}
	public int getBusnumber() {
		return busnumber;
	}
	public void setBusnumber(int busnumber) {
		this.busnumber = busnumber;
	}
	public int getDriverno() {
		return driverno;
	}
	public void setDriverno(int driverno) {
		this.driverno = driverno;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
