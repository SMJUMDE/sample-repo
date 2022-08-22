package com.learningcorejava;

public class MethodChaining {

	public static void main(String[] args) {
String s=new String("Nokia");
		
		s.concat("is a wonderful mobile").chars().hashCode();
		
		
		
		
		
		StringBuffer sb=new StringBuffer();
		
		//Method Chaining
		
		sb.append("Testing").insert(2, "XYZ").reverse().delete(0, 1).append("DONE");
	System.out.println(sb);
	
//Testing -->TeXYZsting-->gnitsZYXeT-->nitsZYXeT--> nitsZYXeTDONE
	
	
	
final StringBuffer sb2=new StringBuffer("Test");
	 
//sb2=new StringBuffer("Test2");
	 
sb2.append("The Scenario");


	 System.out.println(sb2);
	
	}

	}

}
