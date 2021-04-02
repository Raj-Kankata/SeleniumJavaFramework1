
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static void demo()throws Exception {
//		try {
			
		System.out.println("Hello World");
		throw new ArithmeticException("not valid operation");
		
//		int i = 1/0;
//		System.out.println("Completed");
	
//		}
//		catch(Exception exp) {
//			System.out.println("I am Inside catch block");
//			System.out.println("Message is : "+exp.getMessage());
//			System.out.println("Cause is : "+exp.getCause());
//			exp.printStackTrace();
//		}
//		finally {
//			System.out.println("I am inside finally block");
//		}
		
}
}