
public class School {
		int R;
		String Y;
		int G;
		
		void Print(){
			System.out.println("교실의 갯수는"+R+"이고 학년의 넥타이 색은 "+Y+"이고 "+"학과는"+G+"개 이다.");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Room{
	int Class;
	
	void room(int R){
		Class = R;
	}
}
class Year{
	String Tye;
	
	void nec(String Y){
		Tye = Y;
	}
}
class ClassGwa{
	int Gwa;
	
	void Gwa(int G){
		Gwa = G;
	}
}