package org.task;

public class Sample1 {
	public static void main(String[] args) {
		
		String str="AruchAmy25@gmail!@#$%^&*.com";
		
		String replaceAll = str.replaceAll("[^a-zA-Z0-9]", "");
		
//		String replaceAll = str.replaceAll("[!@#$%^&*.]", "");
		
		System.out.println(replaceAll);
	}

}
