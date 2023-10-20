package exceptionlatest;

public class TaskStackOverFlow {
	
	public void a() {
		b();
	}
	public void b() {
		a();
	}

}
