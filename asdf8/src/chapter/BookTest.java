package chapter;

public class BookTest {

	public static void main(String[] args) {
		Book b = new Book();
		b.setTitle("ȫ�浿��");
		b.setAuthor("ȫ�浿�� �����");
		b.setPublisher("���ǻ�");
		b.setPage(150);
		b.setCodeNumber(21101);
		System.out.println(b.toString());
	}

}
