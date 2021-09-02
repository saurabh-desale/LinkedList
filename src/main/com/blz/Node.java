package com.blz;


public class Node<K> {
	K key;
	Node<K> next;

	public Node(K ele) {
		key = ele;
		next = null;
	}
}
