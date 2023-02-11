package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
	HashMap<String,String> hashMap= new HashMap<String,String>();
	
	hashMap.put("Ram", "20");
	hashMap.put("Shyam", "20");
	hashMap.put("shiva", "15");
	
	hashMap.forEach((x,y)->System.out.println(x+ " " + y));
	
	}
}
