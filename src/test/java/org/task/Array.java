package org.task;

public class Array {

	public static void main(String[] args) {
		
		String a[]= {"aaaa","bbbb","cccc","zzzz"};
		
		String b[]={"aaaa","dddd","eeee","bbbb"};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				
				if (a[i]==b[j]) {
					
					System.out.println(a[i]);
					
				}
			}	
		}
		
	}
}
