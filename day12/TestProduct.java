package day12;

import java.util.Scanner;

public class TestProduct {
	
	public static void main(String[] args) {
		Methods m = new Methods();
		Scanner s = new Scanner(System.in);
		int n;
		do {
			System.out.println("1--->Add Product");
			System.out.println("2--->Remove Product");
			System.out.println("3--->Display Product");
			System.out.println("4--->Update Product");
			System.out.println("5--->Calculate total price of Product");
			System.out.println("6--->Exit");
			
			n = s.nextInt();
			
			switch(n) {
			case 1 : m.addProduct();
				break;
			case 2 : m.removeProduct();
				break;
			case 3 : m.display();
				break;
			case 4 : m.updatePriceOrQuan();
				break;
			case 5 : m.total();
				break;	
			}			
		}while(n!=6);
		
		s.close();
	}

}
