package homework;

class A {
	public A(){}
}
class B extends A {}
public class Test{
	public static void main(String arts[]){
		A a = new B();
		System.out.println("실행완료");
	}
}