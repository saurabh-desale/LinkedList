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
	

	public void searchKey(SLLOperations<K> myList, K data) {

		if (head == null) {
			System.out.println("Linked List is Empty");
		}
		Node<K> temp = head;
		int count = 0;
		while (temp.getKey() != data && temp.next != null) {
			temp = temp.next;
			count++;
		}
		if (temp.key == data) {
			System.out.println("key is geting at "+count+"th index");
		}else {
			System.out.println("No such elements");
		}

	}
	public SLLOperations<K> searchKeyAndInsertAfterExistingKey(SLLOperations<K> myList, K data,K data2) {
		
		Node<K> newNode = new Node<>(data2);
		if (head == null) {
			System.out.println("Linked List is Empty");
		}
		Node<K> temp = head;
//		int count = 0;
		while (temp.key != data && temp.next != null) {
			temp = temp.next;
//			count++;
		}
		if (temp.key == data) {
			newNode.next = temp.next;
			temp.next=newNode;	
		}else {
			System.out.println("No such elements");
		}
		return myList;
		
	}
	
	public SLLOperations<K> searchKeyAndDelete(SLLOperations<K> myList, K data) {
		
		if (head == null) {
			System.out.println("Linked List is Empty");
		}
		Node<K> temp = head;
		Node<K> last = head;
		while (temp.key != data && temp.next != null) {
			last=temp;
			temp = temp.next;
		}
		if (temp.key == data) {
			last.next=temp.next;
			temp.next=null;
		}else {
			System.out.println("No such elements");
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
	public int sizeOfLinkedList(SLLOperations<K> myList) {
		
		if (head == null) {
			System.out.println("Linked List is Empty");
		}
		Node<K> temp = head;
		int count = 1;
		while (temp.next != null) {
			temp = temp.next;
			count++;
		}
		System.out.println("Size of linked List is: "+count);	
		return count;
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
