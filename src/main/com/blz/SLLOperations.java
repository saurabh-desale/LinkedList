package com.blz;


public class SLLOperations<K> {
	Node<K> head;

	public SLLOperations<K> addLast(SLLOperations<K> myList, K element) {
		Node<K> newNode = new Node<K>(element);
		if (head == null) {
			head = newNode;
		} else {
			Node<K> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return myList;
	}

	public void display(SLLOperations<K> myList) {
		if (head == null) {
			System.out.println("Linked list is Empty");
		} else {
			Node<K> temp = head;
			while (temp.next != null) {
				System.out.print(temp.key + " ");
				temp = temp.next;
			}
			System.out.println(temp.key);
		}
	}
}
