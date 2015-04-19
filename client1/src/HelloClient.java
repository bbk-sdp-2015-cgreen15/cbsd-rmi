package client1;

import interface1.Address;
import interface1.HelloInterface;

import java.rmi.Naming;

public class HelloClient {
	public static void main(String[] argv) {
		try {
			HelloInterface hello = (HelloInterface) Naming.lookup("Hello2");
			String result = hello.sayHello("Boris Johnson", new Address("City Hall", 123445));
			System.out.println(result);
		} catch (Exception e)  {
			System.out.println("HelloClient exception: " + e);
		}
	}


}