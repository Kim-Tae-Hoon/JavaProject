package chapter;

import java.util.*;

public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account();
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해 주십시오 :");
		obj.setName(scan.next());
		System.out.print("잔액을 입력해 주십시오 : ");
		obj.setBalance(scan.nextInt());
		System.out.println(obj.getBalance());
	}

}
