package chapter1_1;

public class BoxTest {

	public static void main(String[] args) {
		Box obj1 = new Box(10, 20, 50);
		Box obj2 = new Box(10, 30, 30);

		System.out.println("obj1 == obj2 : " + obj1.isSameBox(obj2));

	}

}
