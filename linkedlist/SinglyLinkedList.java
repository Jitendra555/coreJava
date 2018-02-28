package com.jeet.linkedlist;

public class SinglyLinkedList {

	public static void main(String[] args) {
		//int arr[] = {2,3,4,9,78};
		LinkedList list = new LinkedList();
		list.inserAtStart(34);
		list.insertAtEnd(2);
		list.insertAtPos(33, 2);
		list.deleteAtPos(3);
		list.display();
	}

}
