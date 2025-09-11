package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReaderExample {
public static void main(String[] args) throws IOException {
	
	String str = null;
	FileReader fw = new FileReader("dac.txt");
	BufferedReader br = new BufferedReader(fw);
	
	while((str = br.readLine())!=null)
	{
		System.out.println(str);
	}
}
}
