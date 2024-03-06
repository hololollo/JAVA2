package sec1;

public class Birthday {
	private String name;
	private int year;
	private int month;
	private int day;
	
	//메서드는 순서 관계X
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//매개변수가 있으면 this.year 등 구분하기 위하여 붙여줘야한다.
	public void birth() {
		System.out.println(year + "-" + month + "-" + day);
	}
	public void birthAddr() {
		System.out.println(this);
	}
}
