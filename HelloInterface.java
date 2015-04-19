import java.rmi.Remote;
import java.rmi.RemoteException;

/**
* Remote Interface
*/

public interface HelloInterface extends Remote {
	public String sayHello(String name) throws RemoteException;
}