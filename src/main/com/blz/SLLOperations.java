package com.blz;

public class SLLOperations<K> {
	public Node<K> head;

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

	public SLLOperations<K> addFirst(SLLOperations<K> obj, K element) {
		Node<K> newNode = new Node<K>(element);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		return obj;
	}

	public SLLOperations<K> addAtNthPos(SLLOperations<K> myList, K key, int pos) {
		Node<K> newNode = new Node<K>(key);
		int counter = 1;
		if (head == null) {
			head = newNode;
		} else if (counter <= pos) {
			Node<K> temp = head;
			while (temp.next != null && counter < pos - 1) {
				counter++;
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
		return myList;
	}

	public SLLOperations<K> delFirst(SLLOperations<K> myList) {
		if (head == null)
			System.out.println("Linked List is Empty");
		Node<K> temp = head;
		head = temp.next;
		temp = null;

		return myList;

	}
	
	public SLLOperations<K> delLast(SLLOperations<K> myList) {
		if (head == null) {
			System.out.println("Linked List is Empty"); 
		}
		Node<K> temp = head;
		Node<K> last = head;
		while(temp.next != null) {
			last = temp;
			temp = temp.next;
		}
		last.next = null; 
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
