package thrwo;

public class ThrowDemo {

	public static void main(String[] args) {
		ThrowDemo ob=new ThrowDemo();
		try {
			int withDrawAmount=5000;
			System.out.println("withdrawing: "+withDrawAmount);
			ob.withdrawFromATM(withDrawAmount,4500);
			System.out.println("Amount Withdrawn");
			
		}catch(RuntimeException ex) {
			System.out.println("Exception occured."+ex.getMessage()); 
		}

	}

	 void withdrawFromATM(int withDrawAmount, int accountNumber) {
		 int balance=getBalanceFromAccount(accountNumber);
		 if(withDrawAmount>balance) {
			 throw new RuntimeException("division by zero");
		 }
		
	}

	 int getBalanceFromAccount(int accountNumber) {
		return 1000;
	}
	

}
