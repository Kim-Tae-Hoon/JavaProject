package chapter;

public class BankAccount {
	private String name;
	private int accountNumber;
	private int balance;
	private double interestRate;

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setAccountNumber(int name) {
		this.accountNumber = accountNumber;
	}

	int getAccountNumber() {
		return accountNumber;
	}

	void setBalance(int balance) {
		this.balance = balance;
	}

	int getBalance() {
		return balance;
	}

	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	double getInterestRate() {
		return interestRate;
	}
	@Override
	public String toString(){
		return "�̸��� = "+getName() +"���¹�ȣ�� = "+getAccountNumber()+"�ܾ��� = "+getBalance()+"�������� = "+getInterestRate()+"�Դϴ�.";
	}

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.setName("ȫ�浿");
		ba.setAccountNumber(135135269);
		ba.setBalance(150000);
		ba.setInterestRate(1.2);

	}

}