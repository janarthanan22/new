package exceptionlatest;

public class demo {

	public static void main(String[] args) {

		System.out.println("Hi");
		int a=10;
		int b=0;
		
		
		
		String out="jana";
		try {
		
		System.out.println(out.charAt(7));
		}
		catch(Exception e) {
			//e.printStackTrace();
		}
		
		
		
		
		int ao[]= {10,20,58};
		try {
		System.out.println(ao[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		String num="Tn66";
		try {
		
		int num1=Integer.parseInt(num);
		System.out.println(num1);
		}
		catch(Exception e) {
			//e.printStackTrace();
		}
		finally {
			System.out.println("this is important message");
		}
		
		
		
		
		String name=null;
		
		try {
		System.out.println(name.charAt(0));
		}
		
		catch(Exception e) {
			//e.printStackTrace();
		}
		
		
		
		
		
		
		
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			//System.out.println("dont divide by zero");
			//System.out.println(e);
			//e.printStackTrace();
		}
		
		
		
		System.out.println("Bye");
	}

}

