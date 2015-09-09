class DoubleLinkedListDemo {
	public static void main(String[] args) {
		DoubleLinkedList<Integer> dll = new DoubleLinkedList<Integer>();
		DoubleLinkedList<Integer> dll1 = new DoubleLinkedList<Integer>(); 
		dll.insertElement(1);
		dll.insertElement(2);
		dll.insertElement(3);
		dll.insertElement(4);
		dll.insertAfterElement(4,5);
		dll.insertBeforeElement(3,6);
		dll.pushBack(0);
		dll1.insertElement(10);
		dll1.insertElement(14);
		dll1.insertAfterElement(10, 11);
		dll1.insertBeforeElement(14, 13);
		dll1.pushFront(7);
		dll1.insertAfterElement(7, 8);
		dll1.insertBeforeElement(10, 9);
		dll1.popBack();
		dll.concatListAtIndex(dll1, 3);
		dll.makeEmpty();
		dll.printReverse();
	}
}