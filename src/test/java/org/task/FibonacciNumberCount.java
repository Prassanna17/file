package org.task;

public class FibonacciNumberCount {
	public static void main(String[] args) {
		
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 0; i < 10; i++) {
			
			int temp=a+b;
			a=b;
			b=temp;
			
			System.out.println(temp);
			
		}
		
	}

}
