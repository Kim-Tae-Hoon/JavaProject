import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Test {
	JFrame frame = new JFrame("아아아");

	String header[] = { "이름", "국어점수", "영어점수", "수학점수" };
	Object contents[][] = {};

	JTable jTable = new JTable(contents, header);
	JScrollPane scroll = new JScrollPane(jTable);

	public Test() {
		frame.add(scroll);
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Test();
	}

}
