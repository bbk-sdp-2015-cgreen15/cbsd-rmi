import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class HelloImpl extends UnicastRemoteObject implements HelloInterface {
	public HelloImpl() throws RemoteException {

	}
	@Override
	public String sayHello(String name) throws RemoteException {
		return "Hello " + name + "!";
	}
}