import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ScoreGui extends JFrame {
	public ScoreGui() {
		JFrame f = new JFrame();
		
		String name = "";
		String kor = "";
		String eng = "";
		String math = "";
		
		JTextField txt1 = new JTextField(15);
		JTextField txt2 = new JTextField();
		JTextField txt3 = new JTextField();
		JTextField txt4 = new JTextField();

		String header[] = { "이름", "국어점수", "영어점수", "수학점수","총점","평균" };
		Object contents[][] = {{"",0,0,0,0,0}};
		

		JTable jTable = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(jTable);

		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();

		JButton btn1 = new JButton("추가");
		JButton btn2 = new JButton("수정");
		JButton btn3 = new JButton("삭제");
		
		btn1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				txt1.setText(name);
				txt2.setText(kor);
				txt3.setText(eng);
				txt4.setText(math);
				
				contents[1].equals(txt1.getText());
				contents[2].equals(txt2.getText());
				contents[3].equals(txt3.getText());
				contents[4].equals(txt4.getText());
				
			}
		});
		
		JLabel lb1 = new JLabel("이름");
		JLabel lb2 = new JLabel("국어점수");
		JLabel lb3 = new JLabel("영어점수");
		JLabel lb4 = new JLabel("수학점수");
		
		lb1.setBorder(BorderFactory.createTitledBorder(""));
		lb2.setBorder(BorderFactory.createTitledBorder(""));
		lb3.setBorder(BorderFactory.createTitledBorder(""));
		lb4.setBorder(BorderFactory.createTitledBorder(""));

		panelA.add(lb1);
		panelA.add(txt1);
		panelA.add(btn1);

		panelA.add(lb2);
		panelA.add(txt2);
		panelA.add(btn2);

		panelA.add(lb3);
		panelA.add(txt3);
		panelA.add(btn3);

		panelA.add(lb4);
		panelA.add(txt4);

		panelB.add(scroll);

		f.setSize(1050, 500);
		f.setTitle("성적 계산");
		panelA.setLayout(new GridLayout(4, 4, 5, 5));

		f.add(panel);
		panel.add(panelA);
		panel.add(panelB);

		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		ScoreGui s = new ScoreGui();

	}

}
