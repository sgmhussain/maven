package day23;

public class Hsbc implements Bank{


	public static void main(String[] args) {
		Hsbc h=new Hsbc();
		h.debit();
		h.credit();
		h.moneyTransfer();
	}
	
	public void debit() {
		System.out.println("Debit Process");
	}

	public void credit() {
		System.out.println("Credit policy");
	}

	public void moneyTransfer() {
		System.out.println("This is for money transfer");
	}

}



