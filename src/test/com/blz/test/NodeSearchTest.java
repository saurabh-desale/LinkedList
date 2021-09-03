package com.blz.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.blz.Node;

class NodeSearchTest {

	@Test
	 void testSearchNodeKey( ) {
		Node<Integer> obj = new Node<>(30);
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
	 	myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		Node<Integer> temp = myFirstNode;
		int count = 0;
		while (temp.getKey() != obj.getKey() && temp.getNext() != null) {
			temp = temp.getNext();
			count++;
		}
	
		assertTrue(count==1);
	}
	
	@Test
	void testInsertNodeKey( ) {
		Node<Integer> searchKey = new Node<>(30);
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		Node<Integer> temp = myFirstNode;
		int count = 0;
		while (temp.getKey() != searchKey.getKey() && temp.getNext() != null) {
			temp = temp.getNext();
			count++;
		}
		Node<Integer> addNew = new Node<>(40);
		mySecondNode.setNext(addNew);
		addNew.setNext(myThirdNode);
		count++;
		
		boolean result = addNew.getKey()==40 && addNew.getNext()==myThirdNode && mySecondNode.getNext() == addNew
				&& mySecondNode.getKey()==30 && count ==2; 
		assertTrue(result);
		
	}


}
