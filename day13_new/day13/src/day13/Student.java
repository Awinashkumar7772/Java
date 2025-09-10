package day13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
	int studentID;
	String name;
	double fees;
	String courses;
	
	public Student(int studentID, String name, double fees, String courses) {
		
		this.studentID = studentID;
		this.name = name;
		this.fees = fees;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Id : " + studentID + ", name: " + name + ", fees: " + fees + ", courses: " + courses;
	}
	
}

class Methods{
	HashMap<Integer, Student> h = new HashMap<>();
	Scanner s = new Scanner(System.in);
	
	public HashMap<Integer, Student> addStudent(){
		System.out.println("Enter the number of students");
		int n = s.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter Id, name, fees, courses");
			Student stu = new Student(s.nextInt(), s.next(), s.nextDouble(), s.next());
			h.put(stu.studentID, stu);
		}
		return h;
	}
	
	public void retrieveStudent() {
		if(!h.isEmpty()) {
		   System.out.println("Enter the Id of the student");
		   int n = s.nextInt();
		   System.out.println(h.get(n));
		}
		else {
			System.out.println("No student to display");
		}
	}
	
	public void studentExists() {
		System.out.println("Enter Id of student to check");
		int n = s.nextInt();
		if(h.containsKey(n)) {
			System.out.println("Yes Student Exists");
		}
		else {
			System.out.println("Student doesnt exists");
		}
	}
	
	public void display() {
		if(!h.isEmpty()) {
		   for(Map.Entry<Integer, Student> m : h.entrySet()) {
			   System.out.println(m.toString());
		   }
		}
		else {
			System.out.println("No student to display");
		}
	}
	
	public void keysetIteration() {
		for(Integer i : h.keySet()) {
			System.out.println(i);
		}
	}
	
	public void valueIteration() {
		for(Student i : h.values()) {
			System.out.println(i);
		}
	}
	
	public void updateStudent() {
		if(!h.isEmpty()) {
		   System.out.println("Enter the student Id you want to update");
	       int n = s.nextInt();
	       Student old = h.get(n);
	       System.out.println("What do you want to change? Course/Fees");
	       String check = s.next();
	       if(check.equalsIgnoreCase("Course")) {
	    	   System.out.println("Enter New course");
	    	   String cour = s.next();
	    	   Student newStu = new Student(old.studentID, old.name, old.fees, cour);
	    	   h.replace(n, newStu);
	    	   System.out.println("Success!");
	    }
	       else {
	    	   System.out.println("Enter new fees");
	    	   double newFees = s.nextDouble();
	    	   Student newStu = new Student(old.studentID, old.name, newFees, old.courses);
	    	   h.replace(n, newStu);
	    	   System.out.println("Success!");
	       }
		}
		else {
			System.out.println("No student to update");
		}
	    
	}
	
	public void removeStudent() {
		if(!h.isEmpty()) {
		   System.out.println("Enter Id you want to remove");
		   int n = s.nextInt();
		
		   h.remove(n);
		   System.out.println("Removed Successfully");
		}
		else {
			System.out.println("No student to remove");
		}
	}
	
	
	
}















