package com.learningcorejava;

public class Test {
	public static void main(String[] args) {

		//String is Immutable
				String s=new String("Lenovo");  //string object
			
			String s2=	s.concat("Laptop");
				System.out.println(s);
				
				System.out.println(s2);
				
				//StringBuffer is mutable
				StringBuffer sb=new StringBuffer("Lenovo");
				sb.append(" Laptop");
				System.out.println(sb);
			}

}
