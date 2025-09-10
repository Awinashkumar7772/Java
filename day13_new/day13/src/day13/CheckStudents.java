package day13;

import java.util.Scanner;

public class CheckStudents {
	
	public static void main(String[] args) {
		Methods m = new Methods();
		Scanner s = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("1--->Add Student");
			System.out.println("2--->Remove Student");
			System.out.println("3--->Display Student");
			System.out.println("4--->Retrieve Student");
			System.out.println("5--->Check if Student Exists");
			System.out.println("6--->updateStudent");
			System.out.println("7--->iterate through key");
			System.out.println("8--->iterate through value");
			System.out.println("9--->Exit");
			
			n = s.nextInt();
			
			switch(n) {
			case 1 : m.addStudent();
				break;
			case 2 : m.removeStudent();
				break;
			case 3 : m.display();
				break;
			case 4 : m.retrieveStudent();
				break;
			case 5 : m.studentExists();
				break;
			case 6 : m.updateStudent();
				break;
			case 7 : m.keysetIteration();
				break;
			case 8 : m.valueIteration();
				break;
			case 9 : System.out.println("Goodbye...!");
			    break;
			
			}
			
		}while(n!=9);
		
		s.close();
	}

}
