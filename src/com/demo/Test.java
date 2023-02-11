package com.demo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("Pradeep");
		al.add("Ram");
		al.add("Shyam");
		
		al.stream().forEach(x->System.out.println(x));
	}
}
