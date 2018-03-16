package chapter;

public class Account {
	private int regNumber;
	private String name;
	private int balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance == 0) {
			System.out.println("0보다 큰값을 입력하십시오");
		} else if (balance > 0) {
			System.out.println("출력");
		}
	}
}
