import java.awt.*;
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
import javax.swing.SwingConstants;

public class Score extends JFrame {
	Score() {
		JFrame f = new JFrame();

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1100, 500);
		f.setTitle("성적 관리 프로그램");
		f.setLayout(new BorderLayout());

		JButton btn1 = new JButton("추가");
		JButton btn2 = new JButton("제거");
		JButton btn3 = new JButton("수정");

		JLabel lb1 = new JLabel("이름");
		JLabel lb2 = new JLabel("국어 점수");
		JLabel lb3 = new JLabel("영어 점수");
		JLabel lb4 = new JLabel("수학 점수");

		JTextField txt1 = new JTextField(10);
		JTextField txt2 = new JTextField(10);
		JTextField txt3 = new JTextField(10);
		JTextField txt4 = new JTextField(10);

		JPanel panel = new JPanel();

		String header[] = { "이름", "국어 점수", "영어 점수", "수학 점수", "총점", "평균" };
		Object contents[][] = {};
		
		btn1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String name;
				int kor = 0;
				int eng = 0;
				int math = 0;
				int tot = kor+eng+math;
				int avg = (kor+eng+math)/3;
				
			}
			
		});

		JTable table = new JTable(contents, header);
		JScrollPane sc = new JScrollPane(table);

		lb1.setBorder(BorderFactory.createRaisedBevelBorder());
		lb1.setHorizontalAlignment(SwingConstants.CENTER);

		lb2.setBorder(BorderFactory.createRaisedBevelBorder());
		lb2.setHorizontalAlignment(SwingConstants.CENTER);

		lb3.setBorder(BorderFactory.createRaisedBevelBorder());
		lb3.setHorizontalAlignment(SwingConstants.CENTER);

		lb4.setBorder(BorderFactory.createRaisedBevelBorder());
		lb4.setHorizontalAlignment(SwingConstants.CENTER);

		panel.add(lb1);
		panel.add(txt1);
		panel.add(btn1);

		panel.add(lb2);
		panel.add(txt2);
		panel.add(btn2);

		panel.add(lb3);
		panel.add(txt3);
		panel.add(btn3);

		panel.add(lb4);
		panel.add(txt4);

		panel.setLayout(new GridLayout(4, 3, 5, 5));
		f.add(panel, BorderLayout.LINE_START);
		f.add(sc, BorderLayout.CENTER);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		Score s = new Score();

	}

}
