package com.cfmy.model;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Theater implements Serializable {
	private int tid;
	private String name;
	private String location;
	private int screens;
	private LocalDateTime Mdate;
	
	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getScreens() {
		return screens;
	}

	public void setScreens(int screens) {
		this.screens = screens;
	}

	public LocalDateTime getMdate() {
		return Mdate;
	}

	public void setMdate(LocalDateTime mdate) {
		Mdate = mdate;
	}

	public Theater() {
		// TODO Auto-generated constructor stub
	}

	public Theater(int tid, String name, String location, int screens, LocalDateTime mdate) {
		super();
		this.tid = tid;
		this.name = name;
		this.location = location;
		this.screens = screens;
		Mdate = mdate;
	}
	public Theater( String name, String location, int screens, LocalDateTime mdate) {
		super();		
		this.name = name;
		this.location = location;
		this.screens = screens;
		Mdate = mdate;
	}

	@Override
	public String toString() {
		return "Theater [tid=" + tid + ", name=" + name + ", location=" + location + ", screens=" + screens + ", Mdate="
				+ Mdate + "]";
	}
	
}