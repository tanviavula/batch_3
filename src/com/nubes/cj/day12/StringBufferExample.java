package com.nubes.cj.day12;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Hi");
		StringBuilder sb2 = new StringBuilder("Hi");
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.toString().equals(sb2.toString()));
		
		int age = 35;
		String name = "Krish";
		String email = "krish.t@gmail.com";
		
		StringBuilder sb = new StringBuilder();
		String profile = sb.append("Hello ").append(name).append(" ").append(email).append(" ").append(age).toString();
		System.out.println(profile);
		
		String data = "MOM";
		
		StringBuilder sbObj = new StringBuilder(data);
		String rdata = sbObj.reverse().toString();
	
		if(rdata.equals(data)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	
	}
}
