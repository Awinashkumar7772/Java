package fileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.Serializable;

import fileHandling.FileObjectWrite.Student;

public class FileObjectWrite {
 public interface Student {

	}

 public static void main(String[] args) {
	Student s1 = new Student(1001 "Awi" 30);
	Student s2 = new Student(1002 "bbd" 40);
	Student s3 = new Student(1003 "ccd" 50);
	
	FileOutputStream fs = new FileOutputStream("dac1");
	ObjectOutputStream os = new ObjectOutputStream(fs);
	
	os.writeObject(s1);
	os.writeObject(s2);
	os.writeObject(s3);
	System.out.println("object is over");
}
}
