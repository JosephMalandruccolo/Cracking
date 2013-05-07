package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.ArraysAndStrings;

public class ArraysAndStringsTest {
	
	
	//=====================================================================
	//	=>	CONSTANTS
	//=====================================================================
	public static final String UNIQUE_CHARACTERS = "Aldrin";
	public static final String DUPLICATE_CHARACTERS = "Hello";
	public static final String EMPTY_STRING = "";
	public static final String PERMUTATION_ONE = "orchestra";
	public static final String PERMUTATION_TWO = "carthorse";
	
	
	//=====================================================================
	//	=>	QUESTION 1.1
	//=====================================================================
	
	@Test
	public void testIsUniqueOnUniqueString() {
		assertTrue(ArraysAndStrings.isUnique(UNIQUE_CHARACTERS));
	}
	
	@Test
	public void testIsUniqueOnDuplicateString() {
		assertFalse(ArraysAndStrings.isUnique(DUPLICATE_CHARACTERS));
	}
	
	@Test
	public void testIsUniqueOnEmptyString() {
		assertTrue(ArraysAndStrings.isUnique(EMPTY_STRING));
	}
	
	@Test
	public void testIsUniqueInPlaceOnUniqueString() {
		assertTrue(ArraysAndStrings.isUniqueInPlace(UNIQUE_CHARACTERS));
	}
	
	@Test
	public void testIsUniqueInPlaceOnDuplicateString() {
		assertFalse(ArraysAndStrings.isUniqueInPlace(DUPLICATE_CHARACTERS));
	}
	
	@Test
	public void testIsUniqueInPlaceOnEmptyString() {
		assertTrue(ArraysAndStrings.isUniqueInPlace(EMPTY_STRING));
	}
	
	
	//=====================================================================
	//	=>	QUESTION 1.3
	//=====================================================================
	@Test
	public void testIsPermutationOnPermutation() {
		assertTrue(ArraysAndStrings.isPermutation(PERMUTATION_ONE, PERMUTATION_TWO));
	}
	
	@Test
	public void testIsPermutationOnNonPermutation() {
		assertFalse(ArraysAndStrings.isPermutation(PERMUTATION_ONE, UNIQUE_CHARACTERS));
	}

}
