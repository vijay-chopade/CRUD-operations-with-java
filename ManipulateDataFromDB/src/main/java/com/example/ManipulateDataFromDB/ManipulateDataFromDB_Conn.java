package com.example.ManipulateDataFromDB;

import java.sql.*;
import java.util.*;

public class ManipulateDataFromDB_Conn {

	public static Statement getstm() {
		Statement stm = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "juser", "juser"));
			stm =con.createStatement();
		}
		catch(Exception e) {
			System.err.println("Error in connection");
		}
		return stm;
	}
	
	public static ArrayList<ManipulateDataFromDB_DAO> disdata() {
		ArrayList<ManipulateDataFromDB_DAO> am = new ArrayList<>();
		try {
			Statement stm = ManipulateDataFromDB_Conn.getstm();
			String mysql = "select * from students";
			ResultSet rs = stm.executeQuery(mysql);
			while(rs.next()) {
				am.add(new ManipulateDataFromDB_DAO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5)));
				System.err.println(rs.getInt(1)+" <---> "+rs.getString(2)+" <---> "+rs.getString(3)+" <---> "+rs.getInt(4)+" <---> "+rs.getString(5));
			}
		}
		catch(Exception e) {
			System.err.println("Error >> disdata()......");
		}
		return am;
	}
	
	public static int insData(ManipulateDataFromDB_DAO data) {
		int rs =0;
		try {
			Statement stm = ManipulateDataFromDB_Conn.getstm();
			String mysql = "insert into students(fname,lname,marks,city) values ('"+data.getFirstName()+"','"+data.getLastName()+"','"+data.getMarks()+"','"+data.getCity()+"')";
			rs = stm.executeUpdate(mysql);
		}catch(Exception e) {
			System.err.println("Error >> insData()......");
		}
		return rs;
	}
	
	public static int delData(ManipulateDataFromDB_DAO deldata) {
		int rs =0;
		try {
			Statement stm = ManipulateDataFromDB_Conn.getstm();
			String mysql = "delete from students where id in('"+deldata.getId()+"')";
			rs = stm.executeUpdate(mysql);
		} catch(Exception e) {
			System.err.println("Error >> in delData()......");
		}
		return rs;
	}
	
	public static int upData(ManipulateDataFromDB_DAO data) {
		int rs =0;
		Statement stm = ManipulateDataFromDB_Conn.getstm();
		String mysql = "";
		if(data.getFirstName()!=null) {
			mysql = "update students set fname='"+data.getFirstName()+"'where id ='"+data.getId()+"'";
		}else if(data.getLastName()!=null) {
			mysql = "update students set lname='"+data.getLastName()+"'where id ='"+data.getId()+"'";
		}else if(data.getMarks()!=0) {
			mysql = "update students set marks = '"+data.getMarks()+"' where id ='"+data.getId()+"'";
		}else if(data.getCity()!=null) {
			mysql = "update students set city='"+data.getCity()+"'where id ='"+data.getId()+"'";
		}
		try {
			rs = stm.executeUpdate(mysql);
		}catch(Exception e) {
			System.err.println("Error >> upData()......");
		}
		return rs;
	}
	
}



















