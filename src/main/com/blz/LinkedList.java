package com.blz;


public class LinkedList {
	public static SLLOperations<Integer> list = new SLLOperations<>();

	public static void main(String[] args) {
		list.addLast(list, 56);
		list.addLast(list, 30);
		list.addLast(list, 70);
		list.display(list);
		
}
}
