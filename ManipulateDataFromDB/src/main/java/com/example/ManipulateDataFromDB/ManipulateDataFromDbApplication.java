package com.example.ManipulateDataFromDB;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ManipulateDataFromDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManipulateDataFromDbApplication.class, args);
	}

	@GetMapping("getData")
	public ArrayList<ManipulateDataFromDB_DAO> displayData() {
		 
		
		return ManipulateDataFromDB_Conn.disdata();
	}
	
	@PostMapping("postData") 
	public static String setData(@RequestBody ManipulateDataFromDB_DAO data){
		int rs = ManipulateDataFromDB_Conn.insData(data);
		return "Query OK, "+rs+" row affected ";
	}
	
	@DeleteMapping("deleteData")
	public static String delData(@RequestBody ManipulateDataFromDB_DAO data) {
		int rs = ManipulateDataFromDB_Conn.delData(data);
		String mes=null;
		if(rs==0) {
			mes = "Query OK, This Student Already Deleted!";
		}else {mes="Query OK, "+rs+" row affected ";}
		return mes;
	}
	
	@PutMapping("putData")
	public static String upData(@RequestBody ManipulateDataFromDB_DAO data) {
		int rs = ManipulateDataFromDB_Conn.upData(data);
		return "Query OK, "+rs+" row affected ";
	}
	
}











