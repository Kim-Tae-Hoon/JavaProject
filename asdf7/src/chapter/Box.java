package chapter;

public class Box {
	private int width;
	private int length;
	private int height;
	private static boolean empty;

	Box(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
	}
	
	void setEmpty(boolean empty){
		this.empty = empty;
	}
	
	boolean getEmpty() {
		if(empty == true){
			System.out.println("상자가 비어있습니다.");
		}
		else {
			System.out.println("상자가 차있습니다.");
		}
		return empty;
	}

	public static void main(String[] args) {
		Box b = new Box(0,0,0);
		b.setEmpty(true);
		System.out.println(b.getEmpty());
	}

}
