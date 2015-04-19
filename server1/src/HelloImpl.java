package server1;

import interface1.Address;
import interface1.HelloInterface;
import java.rmi.RemoteException;

public class HelloImpl implements HelloInterface {
	public HelloImpl() {

	}

	@Override
	public String sayHello(String name, Address address) throws RemoteException {
		return "Hello " + name + "!" + " your zip code is " + address.getZip();
	}
}