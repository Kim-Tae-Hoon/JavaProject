class BankAccount{
	int accountNumber;
	String owner;
	int balance;
	
	void deposit(int amount){
		balance += amount;
	}
	boid widthdraw(int amount){
		balance -= amount;
	}
	public String toString(){
		return"현재 잔액은 " + balance + "입니다.";
	}
	public int transfer(int amount, BankAccount otherAccount){
		otherAccount.deposit(amount);
		return (balance-amount)
	}
}
public class BankAccountTest {
	public static void main (String [] args){
		BankAccount myAccount1 = new BankAccount();
		BankAccount myAccount2 = new BankAccount();
		myAccount1.deposit(10000);
		System.out.println("myAccount1 : "+myAccount1);
		myAccount1.widthdraw(8000);
		System.out.println("myAccount1 : "+myAccount1);
		System.out.println("myAccount2 : "+myAccount2);
		int b = myAccount1.transfer(1000, myAccount2);
		myAccount1.widthdraw(b);
		System.out.println("myAccount1 : "+myAccount1);
		System.out.println("myAccount2 : "+myAccount2);
	}
}
