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
		return "å�� ������ : " + getTitle() + ", å�� ������ ���� : " + getPage() + ", å�� ���ڴ� : " + getAuthor() + ", å�� ���ǻ�� : "
				+ getPublisher() + ", å�� �ڵ��ȣ�� : " + getCodeNumber() + "�Դϴ�.";
	}
}
