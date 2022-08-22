package com.learningcorejava;

public class StringMethods {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String s = "Alphabet";

			System.out.println(s.charAt(5));

			// System.out.println( s.charAt(50)); //StringIndexOutOfBoundsException

			s = s.concat("set");

			System.out.println(s);

			String s2 = new String("ALPHABET");
			s2 = s2.concat("SET");

			System.out.println(s2);
			
			
			System.out.println(s.equals(s2));

			System.out.println(s.equalsIgnoreCase(s2));
			
			
			
			String s3="abcdefg";
			System.out.println(s3.substring(2));
			
			System.out.println(s3.substring(2,5));
			System.out.println(s3.substring(0,2));
			
			System.out.println(s3.length());
			
			
			String s4="aaaa,zzzz";
			
			System.out.println(s4.replace('a', 'z'));
			
			System.out.println(s2.toLowerCase());
			System.out.println(s4.toUpperCase());
			
			
			String s5=" praneet1234 ";
			
			System.out.println(s5.length());
			
			String s6=s5.trim();
			System.out.println(s6.length());
		}

}
