import java.rmi.Naming;

public class HelloServer {
	public static void main(String[] argv) {
		try {
			Naming.rebind("Hello", new HelloImpl());
			System.out.println("Hello Server is ready. " );
		} catch (Exception e) {
			System.out.println("Hello server failed: " + e);
		}
	}
}