package package22;

import java.util.ArrayList;

public class ListSample {

	public static void main(String[] args) {
		ListSample sample = new ListSample();
		sample.checkArrayList8 ();
	}
	
	public void checkArrayList1() {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Array Sample");
	}
	public void checkArrayList2() {
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("E");
		list2.add(1,"A1");
		for(String a: list2) {
			System.out.println(a); // A A1 B C D E
		}
	}
	public void checkArrayList3() {
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("A");
		list3.add("B");
		list3.add("C");
		list3.add("D");
		list3.add("E");
		list3.add(1,"A1");
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add("0 ");
		list2.addAll(list3);
		for(Object a: list2) {
			System.out.println(a); // A A1 B C D E
		}
	}
	public void checkArrayList5() {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		int listSize = list.size();
		for (int loop=0; loop < listSize; loop++) {
			System.out.println("list.get("+loop+")="+list.get(loop));
		}
	}
	public void checkArrayList7() {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		String[] tempArray = new String[list.size()];
		String[] strList = list.toArray(tempArray);
		for(String temp:strList) {
			System.out.println(temp);
		}
	}
	public void checkArrayList8() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		System.out.println("Remove " + list.remove(0));
//		System.out.println(list.remove("A"));
//		ArrayList<String> temp = new ArrayList<>();
//		temp.add("A");
//		list.removeAll(temp);
		for(int i=0; i < list.size(); i++) {
			System.out.println("list.get("+i+")="+list.get(i));
		}
	}
}
