package com.example.ManipulateDataFromDB;

public class ManipulateDataFromDB_DAO {
	
	private int id;
	private String fname;
	private String lname;
	private int marks;
	private String city;
	public ManipulateDataFromDB_DAO(int id, String fname, String lname, int marks, String city) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.marks = marks;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return fname;
	}
	public void setFirstName(String fname) {
		this.fname = fname;
	}
	public String getLastName() {
		return lname;
	}
	public void setLastName(String lname) {
		this.lname = lname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "ManipulateDataFromDB_DAO [id=" + id + ", firstName=" + fname + ", lastName=" + lname + ", marks="
				+ marks + ", city=" + city + "]";
	}
	
}
