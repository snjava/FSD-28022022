
public class DefaultThread {
	public static void main(String[] args) {
		System.out.println("Main Method execution started..");
		
		Thread th = Thread.currentThread();
		System.out.println(th);
		
		System.out.println("Main Method execution ends..");
	}
}
