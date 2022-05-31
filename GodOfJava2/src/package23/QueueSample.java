package package23;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
public class QueueSample {

	public static void main(String[] args) {
		QueueSample sample = new QueueSample();
		sample.checkLinkedList1();
	}
	
	public void checkLinkedList1() {
		LinkedList<String> link = new LinkedList<>();
		link.add("A");
		link.addFirst("B");
		System.out.println(link);
		link.offerFirst("C");
		System.out.println(link);
		link.addLast("D");
		System.out.println(link);
		link.offer("E");
		System.out.println(link);
		link.offerLast("F");
		System.out.println(link);
		link.push("G");
		System.out.println(link);
		link.add(0, "H");
		System.out.println(link);
		System.out.println("EX="+link.set(0, "I"));
		System.out.println(link);
		checkLinkedList2(link);
	}
	public void checkLinkedList2(LinkedList<String> list) {
		ListIterator<String> iter = list.listIterator(list.size());
		while(iter.hasPrevious()) {
			System.out.print(iter.previous() +" ");
		}
	}
}
