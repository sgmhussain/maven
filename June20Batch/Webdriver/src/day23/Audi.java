package day23;

public class Audi  extends Car{

	String model;
	public void stop()
	{
		System.out.println("This is to stop the car");
	}
	public static void main(String[] args) {
		Audi a=new Audi();
		a.model="A4";
		a.stop();
		a.start();
		a.price=1111;

	}

}









