import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ScoreGui extends JFrame {
	public ScoreGui() {
		JFrame f = new JFrame();
		
		String header[] = { "�̸�", "��������", "��������", "��������" };
		Object contents[][] = {};
		
		JTable jTable = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(jTable);
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JButton btn1 = new JButton("Ȯ��");
		JButton btn2 = new JButton("����");
		JButton btn3 = new JButton("����");
		
		Button btn_1 = new Button("�̸�");
		btn_1.setSize(70, 70);		
		Button btn_2 = new Button("��������");
		btn_2.setSize(70, 70);
		Button btn_3 = new Button("��������");
		btn_3.setSize(70, 70);
		Button btn_4 = new Button("��������");
		btn_4.setSize(70, 70);
		
		JTextField txt1 = new JTextField(15); 
		JTextField txt2 = new JTextField();
		JTextField txt3 = new JTextField();
		JTextField txt4 = new JTextField();
		
		panelA.add(btn_1);
		panelA.add(txt1);
		panelA.add(btn1);
		
		panelA.add(btn_2);
		panelA.add(txt2);
		panelA.add(btn2);
		
		panelA.add(btn_3);
		panelA.add(txt3);
		panelA.add(btn3);
		
		panelA.add(btn_4);
		panelA.add(txt4);
		
		panelB.add(scroll);
		
		f.setSize(1050, 500);
		f.setTitle("���� ���");
		panelA.setLayout(new GridLayout(4,4,5,5));
		
		f.add(panel);
		panel.add(panelA);
		panel.add(panelB);
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		ScoreGui s = new ScoreGui();

	}

}
