package chapter;

public class Parent {
	public void print(){
		System.out.println("�θ� Ŭ������ print() �޼ҵ�");
	}
}
class Child extends Parent {
	public void print(){
		super.print();
		System.out.println("�ڽ� Ŭ������ print() �޼ҵ�");
	}
	public static void main(String[] args){
		Child obj = new Child();
		obj.print();
	}
}