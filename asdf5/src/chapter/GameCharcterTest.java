package chapter;

public class GameCharcterTest {
	public static void main(String[] args) {
		GameCharcter charac = new GameCharcter();
		charac.add("Sword", 1, 100);
		charac.add("Gun", 2, 500);
		charac.print();
	}
}
