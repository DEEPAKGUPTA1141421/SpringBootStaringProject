package com.springboot.tutorial;
import java.util.UUID;
public class userData {
	public String id;
	public String name;
	public int age;
	public String roll;
	userData(String a,String b,int c){
		String uuid = UUID.randomUUID().toString();
	    id= uuid.replaceAll("-", "").toUpperCase();
		name=a;
		roll=b;
		age=c;
		
	}
}
