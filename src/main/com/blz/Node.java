package com.blz;


public class Node<K> {
	K key;
	Node<K> next;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public Node<K> getNext() {
		return next;
	}

	public void setNext(Node<K> next) {
		this.next = next;
	}

	public Node(K ele) {
		key = ele;
		next = null;
	}
}
