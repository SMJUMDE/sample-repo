package com.learningcorejava;

public class Test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	//	String s=new String("Test"); //heap & scp
	//	String s2="Test";    //scp
		
		
		String s1=new String("Test");   //heap
		String s2=new String("Test");   //heap
		String s3="Test";              //scp                 s3--> (test)<--s4
		String s4="Test";
		
	
	}


}
