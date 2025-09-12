

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {
 public static void main(String[] args) throws UnknownHostException, IOException {
	Socket s = new Socket("192.168.2.93",888);
	
	// read from console
	
	
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(ir);
	String msg = br.readLine();
	//write to socket
	
	
	OutputStream os = s.getOutputStream();
	PrintStream pt = new PrintStream(os);
	pt.println(msg);
	//read from socket
	
	
	InputStreamReader ir1 = new InputStreamReader(s.getInputStream());
	BufferedReader br1 = new BufferedReader(ir1);
	String servermsg = br1.readLine();
	//write to console
	
	
	System.out.println(servermsg);
}
}
