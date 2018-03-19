package chapter4;

public class Date {
	private int year;
	private String month;
	private int day;

	public Date() {
		this(1900, "1¿ù", 1);
	}
	public Date(int year){
		this(year, "1¿ù",1);
	}
	public Date(int year, String month, int day){
		this.month = month;
		this.year = year;
		this.day = day;
	}
	@Override
	public String toString(){
		return "Date [year="+year+", month="+month+", day="+day+"]";
	}
}
