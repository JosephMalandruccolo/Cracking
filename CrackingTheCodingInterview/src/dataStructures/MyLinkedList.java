package dataStructures;

/**
 * My implementation of a doubly LinkedList
 * @author Joseph Malandruccolo
 *
 */
public class MyLinkedList<T> {
	
	
	
	//=====================================================================
	//	=>	PROPERTIES
	//=====================================================================
	private MyNode head;
	private MyNode tail;
	private int size;
	
	
	
	//=====================================================================
	//	=>	CONSTRUCTORS
	//=====================================================================
	public MyLinkedList () {
		this.size = 0;
	}
	
	
	//=====================================================================
	//	=>	PUBLIC API
	//=====================================================================
	/**
	 * append an item to the back of the list
	 * @param e - the item to add
	 * @return true
	 */
	public boolean addLast (T e) {
		
		//	handle insertion on the empty MyLinkedList
		if (this.size == 0) {
			
			this.head = new MyNode(e, null, null);
			this.tail = this.head;
			
		}
		//	handle insertion on a non-empty MyLinkedList
		else {
			
			this.tail.next = new MyNode (e, this.tail, null);
			this.tail = this.tail.next;
			
		}
		
		this.size++;
		
		return true;
		
	}
	
	
	/**
	 * insert an item at the head of the list
	 * @param e - the item to add
	 * @return true
	 */
	public boolean addFirst (T e) {
		
		//	handle insertion on the empty MyLinkedList
		if (this.size == 0) {
			
			this.head = new MyNode (e, null, null);
			this.tail = this.head;
			
		}
		//	handle insertion on a non-empty MyLinkedList
		else {
			
			this.head = new MyNode (e, null, this.head);
			
		}
		
		this.size++;
		
		return true;
		
	}
	
	
	/**
	 * Add an item at an arbitrary index
	 * @param e - the item to add
	 * @param index - the index at which to add the item
	 * @return
	 */
	public boolean addAtIndex (T e, int index) {
		
		if (index < 0 || index >= this.size) throw new IndexOutOfBoundsException();
		
		//	add at index 0
		if (index == 0) return this.addFirst(e);
		
		//	add at the last index
		else if (index == this.size - 1) return this.addLast(e);
		
		//	add at an index that is neither first nor last
		else {
			
			MyNode current = this.head;
			
			//	iterate until we have the node that is one before our target index
			for (int i = 0; i < index - 1; i++) current = current.next;
			
			//	move the pointers
			MyNode nodeToAdd = new MyNode (e, current, current.next);
			current.next = nodeToAdd;
			
			//	increment the size
			this.size++;
			
			return true;
			
		}
	}
	
	
	
	public T get(int index) {
		
		if (index < 0 || index >= this.size) throw new IndexOutOfBoundsException();
		
		//	handle ask for head
		if (index == 0) return this.head.data;
		
		//	handle ask for tail
		else if (index == this.size - 1) return this.tail.data;
		
		//	handle ask for anything else
		else {
			
			MyNode current = this.head;
			
			for (int i = 0; i < index; i++) current = current.next;
			
			return current.data;
			
		}
		
	}
	
	
	
	
	
	//=====================================================================
	//	=>	NODE
	//=====================================================================
	class MyNode {
		
		//	properties
		T data;
		MyNode next;
		MyNode prev;
		
		MyNode (T data, MyNode prev, MyNode next) {
			this.data = data;
			this.prev = prev;
			this.next = next;
		}
		
		
	}

}
