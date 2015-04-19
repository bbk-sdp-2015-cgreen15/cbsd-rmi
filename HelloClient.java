import java.rmi.Naming;

public class HelloClient {

	public static void main(String[] argv) {
		try {
			HelloInterface hello = (HelloInterface) Naming.lookup("Hello");
			String result = hello.sayHello("David Cameron!");
			System.out.println(result);
		} catch(Exception e ) {
			System.out.println("HelloClient exception: " + e);
		}
	}

}