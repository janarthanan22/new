package exceptionlatest;

public class Task4 {

	public static void main(String[] args) {

		
		String a=null;
		try {
		
		System.out.println(a.toCharArray());
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			
			//System.out.println("handeled nullPointer");
		}
		
		catch(ArithmeticException e) {
			System.out.println("handeled Arithmetic");
		}
		
		catch(Exception e) {
			System.out.println("overall Exception Handled");
		}
		
		
	}

}
