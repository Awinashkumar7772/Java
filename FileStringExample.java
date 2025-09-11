package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileStringExample {
 public static void main(String[] args) throws IOException {
	String str = null;
	FileWriter fw = new FileWriter("dac.txt");
	System.out.println("enter the string");
	Scanner sc = new Scanner(System.in);
	str = sc.nextLine();
	fw.write(str);
	fw.close();
	System.out.println("file is over");
}
}
