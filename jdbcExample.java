package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbcExample {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner s = new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","cdacacts");
	String q = "insert into employee(id,name,dept) values(?,?,?)";
	System.out.println("Enter the id,name and dept");
	int id = s.nextInt();
	String name = s.next();
	String dept = s.next();
	PreparedStatement pmt = con.prepareStatement(q);
	pmt.setInt(1, id);
	pmt.setString(2, name);
	pmt.setString(3, dept);
	
	pmt.executeUpdate();
	display();
	remove();
	

}
public static void display() throws SQLException {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","cdacacts");
	String q = "select * from employee";
    PreparedStatement pmt = con.prepareStatement(q);
    ResultSet rs = pmt.executeQuery();
    while(rs.next()) {
    	System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));
    	
    }
    
}
public static void remove() throws SQLException {
	Scanner  s = new Scanner(System.in);
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","cdacacts");
	System.out.println("Enter the id to remove");
	int n = s.nextInt();
	String q = "delete from employee where id = ?";
	PreparedStatement pmt  = con.prepareStatement(q);
	pmt.setInt(1, n);
	pmt.executeUpdate();
	System.out.println("rmoved successfully");
	
}
}
