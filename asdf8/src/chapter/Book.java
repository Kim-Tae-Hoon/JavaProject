package chapter;

public class Book {
	private String title;
	private String author;
	private int page;
	private int codeNumber;
	private String publisher;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getCodeNumber() {
		return codeNumber;
	}

	public void setCodeNumber(int codeNumber) {
		this.codeNumber = codeNumber;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String toString() {
		return "책의 제목은 : " + getTitle() + ", 책의 페이지 수는 : " + getPage() + ", 책의 저자는 : " + getAuthor() + ", 책의 출판사는 : "
				+ getPublisher() + ", 책의 코드번호는 : " + getCodeNumber() + "입니다.";
	}
}
