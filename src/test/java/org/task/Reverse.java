package org.task;

public class Reverse {
	
	public void rev(String name) {
		
		String rev="";
		for (int i = name.length()-1; i >= 0; i--) {
			
			char charAt = name.charAt(i);
			rev=rev+charAt;	
		}
	System.out.println(rev);
		
	}
	
	
	public static void main(String[] args) {
		
		Reverse aa=new Reverse();
		aa.rev("Aruchamy");

	}

}
