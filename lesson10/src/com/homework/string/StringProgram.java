package com.homework.string;

import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Write down word with 5 letters:");
		sc = new Scanner (System.in);
		String sb = sc.next();
		sb.compareTo(sb);
		
		if(sb.length() ==5 ) {
			System.out.println(sb.length());
		
		}else {
			System.err.println("Word hasn't 5 letters");
		}
	
		System.out.println("Write down any word:  ");
		sc = new Scanner (System.in);
		String st = sc.next();
		
		System.out.println(st.replaceAll("а", " ").replace("o"," ").replace("i"," ").replace("e"," ").replace("u", " ").replace("y", " ").replace("и", " "));
		
		
		System.out.println("Enter ");
		sc = new Scanner (System.in);
		StringBuffer sbf = new StringBuffer("(From the sun that round me rollen in its autumn tint of gold, from the lightning in the sky as it passed me flying by) ");
		
		System.out.println(sbf +" Кількість символів: "+ sbf.length());
		
		
		
		

	}

}
