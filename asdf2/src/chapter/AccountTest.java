package chapter;

import java.util.*;

public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account();
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��� �ֽʽÿ� : ");
		obj.setBalance(scan.nextInt());
		System.out.println(obj.getBalance());
	}

}
