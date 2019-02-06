package day13;

public class InetSolv {

	int price;
	String courseName;
	public void courseDetails(int price,String courseName)
	{
		this.price=price;
		this.courseName=courseName;
	}
	public static void main(String[] args) {
		InetSolv in=new InetSolv();
		
		in.courseDetails(4000,"Selenium");
		
		System.out.println(in.price);
		System.out.println(in.courseName);

	}

}
