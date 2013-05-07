package code;

/**
 * Chapter 1 Questions from Cracking the Coding Interview
 * 
 * @author Joseph Malandruccolo
 */
public class ArraysAndStrings {
	
	
	
	//=====================================================================
	//	=>	QUESTION 1.1
	//=====================================================================
	
	/**
	 * Implement an algorithm to determine if a string has all unique characters
	 * Define an empty String to be unique
	 * Treat uppercase and lowercase instances of the same letter as different characters
	 * @param s - input String
	 * @return true if each character is unique, false otherwise
	 */
	public static boolean isUnique(String s) {
		int[] charCount = new int[256];
		
		for (int i = 0; i < s.length(); i ++) {
			charCount[s.charAt(i)]++;
		}
		
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 1) return false;
		}
		
		return true;
		
	}
	
	
	
	/**
	 * Implement an algorithm to determine if a string has all unique characters
	 * Define an empty String to be unique
	 * Treat uppercase and lowercase instances of the same letter as different characters
	 * CANNOT USE EXTERNAL DATA STRUCTURES
	 * @param s - input String
	 * @return true if each character is unique, false otherwise
	 */
	public static boolean isUniqueInPlace(String s) {
		
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) return false;
			}
		}
		
		return true;
		
	}
	
	
	//=====================================================================
	//	=>	QUESTION 1.3
	//=====================================================================
	
	
	/**
	 * Given two strings, write a method to decide if one is a permutation of the other
	 * @param one - first string
	 * @param two - second string
	 * @return true if the strings are a permutation of one another, false otherwise
	 */
	public static boolean isPermutation(String one, String two) {
		
		if (one.length() != two.length()) return false;
		
		int[] charFrequencyOne = getCharFrequency(one);
		int[] charFrequencyTwo = getCharFrequency(two);
		
		for (int i = 0; i < charFrequencyOne.length; i++) {
			if (charFrequencyOne[i] != charFrequencyTwo[i]) return false;
		}
		
		return true;
			
	}
	
	
	/**
	 * Private helper for isPermutation
	 * @param s - string
	 * @return an integer array indicating the frequency of its ascii characters
	 */
	private static int[] getCharFrequency(String s) {
		int[] charFrequency = new int[256];
		
		for (int i = 0; i < s.length(); i++) {
			charFrequency[s.charAt(i)]++;
		}
		
		return charFrequency;
		
	}
	
	
	
	
	

}
