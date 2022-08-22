package com.learningcorejava;

public class CloneTesting implements Cloneable {
	int i=10;
	int j=20;
	

	public static void main(String[] args) throws CloneNotSupportedException  {

		CloneTesting c1=new CloneTesting();
		CloneTesting c2=(CloneTesting) c1.clone();  //deep cloning-->duplicate object
		
	//	c2.i=888;
	//	c2.j=999;

		System.out.println(c1.i);
		System.out.println(c1.j);
		
		
		System.out.println(c2.i);
		System.out.println(c2.j);
		
		
		System.out.println(c1.hashCode()==c2.hashCode());
		System.out.println(c1==c2);
		
		
		CloneTesting c3=c1;    //shallow cloning-->creating duplicate refernce variable
		
		System.out.println(c1.hashCode());
		System.out.println	(c3.hashCode());
		System.out.println(c1==c3);
	}
//By default cloning means deep cloning
}


