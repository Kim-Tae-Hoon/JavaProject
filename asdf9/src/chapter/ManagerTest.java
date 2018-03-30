package chapter;

public class ManagerTest {
	public static void main(String[] args) {
		Manager m = new Manager("Tom", "Seoul", 1000000, 123456);
		System.out.println(m);
		m.test();
	}
}