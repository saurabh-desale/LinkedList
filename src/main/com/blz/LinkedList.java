package com.blz;


public class LinkedList {
	public static SLLOperations<Integer> list = new SLLOperations<>();

	public static void main(String[] args) {
		//UC1
		/*list.addLast(list, 56);
		list.addLast(list, 30);
		list.addLast(list, 70);
		list.display(list);*/
		
		
		list.addFirst(list, 70);
		list.addFirst(list, 56);
		list.addAtNthPos(list, 30, 1);
		list.delLast(list);
		
		list.display(list);
		list.addLast(list, 70);
		list.searchKey(list, 30);
		list.searchKeyAndInsertAfterExistingKey(list, 30, 40);
		list.display(list);
		
}
}
