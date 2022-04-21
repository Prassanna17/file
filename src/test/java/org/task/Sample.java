package org.task;
public class Sample{
	public static void main(String[] args) {
		String a[]={"aaa","bbb","ccc","zzz"};
		String b[]={"fff","ddd","aaa","bbb"};
		String c="",space=" ";

		for(int i=0 ; i<a.length;i++){
		for(int j=0 ; j<b.length;j++){

		if(a[i].equals(b[j])){
			c=c+a[i]+space;
		}

		}
		}
		System.out.println(c);
	}
}