class Single {
	private static Single s_instance;
	public static Single getInstance() {
		if (S_instance == null) {
			s_instance = new Single();
		}
		return s_instance;
	}
}
public class SingleTest {
	public static void main (String [] args) {
		Single obj1 = Single.getInstance();
		Single obj2 = Single.getInstance();
	}
}
