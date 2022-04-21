package org.task;

public class Star1 {
	
	public static void main(String[] args) {
		
		String a="* ";
		
		for (int i = 1; i <=5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5-i; j >=1; j--) {
				System.out.print(a);
			}
			System.out.println();	
		}
	}

}
