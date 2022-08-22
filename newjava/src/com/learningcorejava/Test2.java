package com.learningcorejava;

public class Test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1=new String("Lenovo");
		String s2=new String("Lenovo");
		
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		
		StringBuffer sb1=new StringBuffer("Lenovo");  //false
		StringBuffer sb2=new StringBuffer("Lenovo");  //false
		
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		
	
	}


}
