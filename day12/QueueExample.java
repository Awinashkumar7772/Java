package day12;

import java.util.PriorityQueue;

public class QueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
	    p.add(10);
	    p.add(20);
	    p.add(30);
	    p.add(40);
	    p.add(50);
	    System.out.println(p);
	    System.out.println(p.peek());
	    System.out.println(p.isEmpty());
	 p.remove(20);
	 System.out.println(p);
	    
   


}
}
