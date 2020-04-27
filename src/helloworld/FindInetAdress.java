package helloworld;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindInetAdress {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		 InetAddress addr = InetAddress.getLocalHost();
	      System.out.println("Local HostAddress:"+addr.getHostAddress());
	      String hostname = addr.getHostName();
	      System.out.println("local host name: "+hostname);
	      }

}
