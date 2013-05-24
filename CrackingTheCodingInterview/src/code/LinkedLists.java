package code;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Chapter 2 Questions from Cracking the Coding Interview
 * 
 * @author Joseph Malandruccolo
 *
 */
public class LinkedLists {
	
	
	//=====================================================================
	//	=>	QUESTION 2.1
	//=====================================================================
	/**
	 * Write code to remove duplicates from an unsorted LinkedList
	 * Assumes - order does not matter, i.e. removing duplicates may change the order of elements
	 * runtime => O (list.size())
	 * @param list - an unsorted LinkedList
	 * @return linked list with duplicates removed
	 */
	public static LinkedList<Integer> removeDuplicatesFromLinkedList (LinkedList<Integer> list) {
		
		HashSet<Integer> uniqueItems = new HashSet<Integer> (list);
		return new LinkedList<Integer> (uniqueItems);
		
	}
	
	
	
	
	
	
}
