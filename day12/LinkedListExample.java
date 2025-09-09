package day12;

import java.util.LinkedList;

public class LinkedListExample {
public static void main(String[] args) {
	LinkedList<Integer> lm = new LinkedList<>();
	lm.add(10);
	lm.add(20);
	lm.add(30);
	lm.add(40);
	lm.add(50);
	System.out.println(lm);
	lm.addFirst(90);
	lm.addLast(100);
	System.out.println(lm);
	lm.remove(4);
	System.out.println(lm);
	System.out.println(lm.getFirst());
	System.out.println(lm.getLast());
	if(lm.contains(20)) {
		System.out.println("Yes");
	}
}
}
