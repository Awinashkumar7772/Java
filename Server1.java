

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
  public static void main(String[] args) throws IOException {
	  ServerSocket ss = new ServerSocket(888);
	  Socket s = ss.accept();
	  
	  System.out.println("Connected client to the server");
	  InputStreamReader ir = new InputStreamReader(s.getInputStream());
	  BufferedReader br = new BufferedReader(ir);
	  String cmsg = br.readLine();
	  
	  //write to the console
	  System.out.println("Message recieved by client"+cmsg);
	  //server reading from the console
	  InputStreamReader ir1 = new InputStreamReader(System.in);
	  BufferedReader br1 = new BufferedReader(ir1);
	  System.out.println("enter the message to the client");
	  String sng = br1.readLine();
	  //write to socket
	  OutputStream os = s.getOutputStream();
	  PrintStream pr = new PrintStream(os);
	  pr.println(sng);
	 
	  
}
}
