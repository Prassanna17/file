package org.task;

public class FibonacciBelow100 {
	public static void main(String[] args) {
		
		int a=0,b=1;
		
		while(a<=200) {
		System.out.println(a);
		int	c=a+b;
			a=b;
			b=c;	
		}
		System.out.println("*****************");	
	}
}
