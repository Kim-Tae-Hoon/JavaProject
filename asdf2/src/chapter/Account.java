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
			System.out.println("0���� ū���� �Է��Ͻʽÿ�");
		} else if (balance > 0) {
			System.out.println("���");
		}
	}
}
