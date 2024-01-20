package PerviousYear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *  Write a method (not the entire application) called CountVowels, which takes the 
	input arguments as character and checks whether it is a vowel; increment the 
	instance variable called vCnt by 1.  
*/



public class Q2A {
	
	static int vCnt = 0;
	
	public static boolean CountVowel(char c) {
		List<Character> listOfVowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
		
		ArrayList<Character> vowel = new ArrayList<Character>();
		vowel.addAll(listOfVowels);
		
		for (Character ch : vowel) {
			if(ch.equals(c)) {
				vCnt++;
				return true;
			}
		}
		return false;
		
	}
	
	public static void main (String[] args) {
		
		CountVowel('a');
		CountVowel('r');
		CountVowel('s');
		CountVowel('t');
		CountVowel('e');
		
		System.out.println(vCnt);
	}
}
