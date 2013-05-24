package test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Test;

import code.LinkedLists;
import dataStructures.MyLinkedList;

public class LinkedListsTest {

	
	//=====================================================================
	//	=>	QUESTION 2.1
	//=====================================================================
	@Test
	public void testRemoveDuplicatesFromLinkedList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(0);
		
		LinkedList<Integer> unique = LinkedLists.removeDuplicatesFromLinkedList(list);
		
		int[] countOfItemsInList = new int[4];
		for (Iterator<Integer> iterator = unique.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			countOfItemsInList[integer]++;
		}
		
		assertTrue(unique.size() == 4);
		assertTrue(countOfItemsInList[0] == 1);
		assertTrue(countOfItemsInList[1] == 1);
		assertTrue(countOfItemsInList[2] == 1);
		assertTrue(countOfItemsInList[3] == 1);
		
		
	}
	
	
	//=====================================================================
	//	=>	MyLinkedList
	//=====================================================================
	
	@Test
	public void testAddFirstOnEmpty() {
		
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		myList.addFirst(5);
		
		assertTrue(myList.get(0) == 5);
	
	}
	
	
	@Test
	public void testAddFirstOnNonEmpty() {
		
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		myList.addFirst(5);
		myList.addFirst(10);
		
		assertTrue(myList.get(0) == 10);
	
	}
	
	
	@Test
	public void testAddLastOnEmpty() {
		
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		myList.addLast(10);
		
		assertTrue(myList.get(0) == 10);
	
	}
	
	
	@Test
	public void testAddLastOnNonEmpty() {
		
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		myList.addLast(15);
		myList.addLast(10);
		
		assertTrue(myList.get(1) == 10);
	
	}

}
