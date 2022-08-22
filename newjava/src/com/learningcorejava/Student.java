package com.learningcorejava;
import java.util.Objects;

public class Student {
	
		
		String name;
		int rollNumber;

		public Student(String name, int rollNumber) {
		
			this.name = name;
			this.rollNumber = rollNumber;
		}

		public static void main(String[] args) {

	                                                         //s1-->()<--s4
			Student s1=new Student("Avinash", 100);          //s2-->()
			Student s2=new Student("Parag", 101);            //s3-->()
			Student s3=new Student("Avinash", 100);
			
			Student s4=s1;
			
			
			//System.out.println(s1.equals(s2));   //f
			//System.out.println(s1.equals(null));   //t
			//System.out.println(s1.equals("prateek"));   //t
			
			
			System.out.println(s1.equals(s2));   //f
			System.out.println(s1.equals(s3));   //t
			System.out.println(s1.equals(s4));   //t
			
			System.out.println(s1==s2);
			System.out.println(s1==s3);
			System.out.println(s1==s4);
			
			
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, rollNumber);
		}

		@Override
		public boolean equals(Object obj) {
			
			
			try {
				
				Student s2=(Student)obj;
				
				if(name.equals(s2.name) && rollNumber==s2.rollNumber)
					return true;
				else
					return false;
			} catch (ClassCastException e) {

				return false;
			}
			
			catch (NullPointerException e) {
				return false;
			}
			
			
			
			
		}

	}



	// relation between ==  and .equals()

	// s1==s2   true       s1.equals(s2) ------>true
	//s1==s2   false       s1.equals(s2) ------>true ,false

	// s1.equals(s2) -->true  s1==s2 -->false, true


	//s1.equals(s2) -->false    s1==s2 -->false


