package chapter;

public class BookTest {

	public static void main(String[] args) {
		Book b = new Book();
		b.setTitle("홍길동전");
		b.setAuthor("홍길동을 본사람");
		b.setPublisher("출판사");
		b.setPage(150);
		b.setCodeNumber(21101);
		System.out.println(b.toString());
	}

}
