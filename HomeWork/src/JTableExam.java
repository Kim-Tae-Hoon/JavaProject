import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExam
{
	JFrame jFrame = new JFrame("JTable ����");

	String columnNames[] =
	{ "��ǰ��ȣ", "��ǰ�̸�", "��ǰ����", "��ǰ����" };

	Object rowData[][] =
	{
	{ 1, "������", 100, "������" },
	{ 2, "������", 200, "�ҷ���ǰ" },
	{ 3, "ĭ����", 300, "���ڰ��� ������" } };

	JTable jTable = new JTable(rowData, columnNames);
	JScrollPane jScollPane = new JScrollPane(jTable);

	public JTableExam()
	{
		jFrame.add(jScollPane);

		jFrame.setSize(400, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args)
	{
		new JTableExam();
	}
}
