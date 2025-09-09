package day12;
import java.util.Stack;

public class StackQues3 {
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(30);
		s.push(30);
		s.push(30);
		s.push(30);
		s.push(30);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		System.out.println(s.peek());
		
		System.out.println(s.isEmpty());
	}

}
