class Employee{
	private String naem;
	private int tel;
	private int sal;
	public void setName(String n){
		name = n;
	}
	public void setTel(int t){
		tel = t;
	}
	public void setName(int s){
		sal = s;
	}
	public void getName(String n){
		return name;
	}
	public void getName(int t){
		return tel;
	}
	public void getName(int s){
		return sal;
	}
}
public class EmployeeTest { 
	public static void main (String [] args)
		Employee em = new Employee();
	}
}
