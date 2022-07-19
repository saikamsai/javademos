package nonstaticcontext;
import finance.BankAccount;
public class DefaultConstructorTest {

	public static void main(String[] args) {
BankAccount account1=new BankAccount(1001,5000);
/*account1.accountNumber=1001;
account1.balanceTotal=5000;
*/
BankAccount account2= new BankAccount(1002,6500);
/*account1.accountNumber=1002;
account1.balanceTotal=6500;
*/
account1.printAccount();
account2.printAccount();


	}

}
