package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
	int id;
	String name;
	double price;
	int quantity;
	
	public Product(int id, String name, double price, int quantity) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ID : " + id + ", Name : " + name + ", Price : " + price + ", Quantity: " + quantity;
	}
	

}

class Methods{
	ArrayList<Product> a = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	
	
	public ArrayList<Product> addProduct(){
		System.out.println("How many products you want to add");
		int n = s.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter Id, ProductName, Price, Quantity");
			Product p = new Product(s.nextInt(), s.next(), s.nextDouble(), s.nextInt());
			a.add(p);
		}
		return a;
	}
	
	public void display() {
		if(!a.isEmpty()) {
		   for(Product p : a) {
			   System.out.println(p.toString());
		   }
		}
		else {
			System.out.println("No products to display");
		}
	}
	
	public void updatePriceOrQuan() {
		if(!a.isEmpty()) {
		   System.out.println("Enter the product id you want to change the values for");
		   int pid = s.nextInt();
		   for(Product p : a) {
			   if(pid == p.id) {
				   System.out.println("What do you want to update? Price/Quantity");
				   String change = s.next();
				   if(change.equalsIgnoreCase("price")) {
					   p.price += 100;
				   }
				   else {
					   p.quantity += 3;
				   }
			   }
		   }
		}
		else{
			System.out.println("No Products in database");
		}
	}
	
	public void removeProduct() {
		if(!a.isEmpty()) {
		   System.out.println("Enter the id for the product you want to remove");
		   int c = s.nextInt()-1;
		   int pos = 0;
		   for(Product p : a) {
			   if(p.id == c) {
				   pos = p.id;
			   }
		   }
		   a.remove(pos);
		   System.out.println("Your product is removed : " + (c+1));
		}
		else {
			System.out.println("No products to remove");
		}
	}
	
	public void total() {
		if(!a.isEmpty()) {
		   int price = 0;
		   System.out.println("Enter the id for which price is to be calculated");
		   int pid = s.nextInt();
		   for(Product p : a) {
			   if(p.id == pid) {
				   price += p.price*p.quantity;
			   }
		   }
		   System.out.println("Your total would be: " + price);
		}
		else {
			System.out.println("You dont have a product in inventory");
		}
	}
}
