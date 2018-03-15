package javaproject;

public class library {	//도서관
	String name;	//이름
	String user;	//사용자
	String book;	//도서

}
class libraryUser{	//도서관의 사용자
	String user;
	int userCount;	//사용자수
	String genre;	//책의 장르
	
//	void borrow(){	//사용자의 대출
//		System.out.println(user+"(이)가 "+genre+" 도서를 대출합니다.");
//	}
}
class libraryGenre{	//도서관의 장르들
	String history; //역사
	String science; //과학
	String cartoon; //만화
	String fear; //
}
class libraryBook{	//도서관 책
	String title;	//책 제목
	String writer;	//책 저자
}