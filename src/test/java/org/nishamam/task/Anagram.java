package org.nishamam.task;

import java.util.Arrays;

public class Anagram {
		public static void main(String[] args) {
			
			String s="aruchamykarthi", s1="kararuthichamy"; 
			
			//declare instant variable
			boolean status;
			
			//main function {toLowerCase().toCharArray()--Arrays.sort()--Arrays.equals}
			
			if (s.length()!=s1.length()) {
				status=false;
			} else {
				
				char[] aa = s.toLowerCase().toCharArray();
				char[] bb = s1.toLowerCase().toCharArray();
				
				Arrays.sort(aa);
				Arrays.sort(bb);
				
				status = Arrays.equals(aa, bb);
			}
			
			if (status) {
				System.out.println(s+"  and  "+ s1 +"   are anagram");
				} else {
					System.out.println(s+"  and  "+ s1 +"   are not anagram");
			}
			
		}

	}
