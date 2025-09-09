package day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Book {
	int bookId; 
	String title;
	String author;
	double price;
	
	public Book(int bookId, String title, String author, double price) {
		
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

}

class Method{
	HashMap<Integer, Book> h = new HashMap<>();
	Scanner s = new Scanner(System.in);

	
	public HashMap<Integer, Book> addBook(){
		 
		 System.out.println("Enter the number of books you want");
		 int n = s.nextInt();
		 for(int i=0; i<n; i++) {
			 System.out.println("Enter Id, Title, Author, Price");
			 Book b = new Book(s.nextInt(), s.next(), s.next(), s.nextDouble());
			 h.put(b.bookId, b);
		 }
			 
		 return h;
	 }
	 
	 public void getBook() {
		 System.out.println("Enter the book id you want");
		 int n = s.nextInt();
		 System.out.println(h.get(n));
	 }
	 
	 public void existsBookId() {
		 System.out.println("Enter the book ID you want to check");
		 int n = s.nextInt();
		 if(h.containsKey(n)) {
			 System.out.println("Yes it exists");
		 }
		 else {
			 System.out.println("Doesnt exists");
		 }
	 }
	 
	 public void displayBooks() {
		for(Map.Entry<Integer, Book> m : h.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	 }
	 
	public void updateDetails(Book b) {	
		    System.out.println("Enter the updated price");
		    double n = s.nextDouble();
		    
			Book dummy = new Book(b.bookId, b.title , b.author, n);
			h.replace(1, dummy);
			displayBooks();
	}
	
	
}
