

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 {
	public static void main(String[] args ) {
		//create linkedList
		LinkedList<String> linkedList = new LinkedList<String>();
		//Add objects to linkedList
		linkedList.add("Java");
		linkedList.add("C++");
		linkedList.add("PHP");
		linkedList.add("C#");
		//Show list through Interator
		Iterator<String> itr = linkedList.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
		//add first
		linkedList.addFirst("Python");
		//show list thourgh for-each
		System.out.println();
		for(String obj : linkedList) {
			System.out.print(obj + ", ");
		}
		//add last
		linkedList.addLast("Ruby");
		System.out.println();
		for(String obj : linkedList) {
			System.out.print(obj + ", ");
		}
	}
}
