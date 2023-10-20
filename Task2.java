package exceptionlatest;

public class Task2 {

	public static void main(String[] args)throws CarException {

		int car=10000;
		
		if(car<10000) {
			System.out.println("You cant buy car");
		}
		else {
			throw new CarException("you can buy");
		}
	}

}
