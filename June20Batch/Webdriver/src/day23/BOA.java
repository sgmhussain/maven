package day23;

public class BOA implements Bank{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BOA b=new BOA();
		b.debit();
		b.credit();

	}

	@Override
	public void debit() {
		System.out.println("abc");
		
	}

	@Override
	public void credit() {
		System.out.println("XYZ");
		
	}

	@Override
	public void moneyTransfer() {
		System.out.println("DEF");
		
	}

}
