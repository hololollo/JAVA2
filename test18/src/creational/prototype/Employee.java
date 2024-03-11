package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{ // 복제하고 싶을 때 
	private List<String> empList;
	public Employee() {
		empList = new ArrayList<String>();
	}
	public Employee(List<String> empList) {
		this.empList = empList;
	}
	public void loadData() {
		empList.add("강범준");
		empList.add("홍길동");
		empList.add("강감찬");
		empList.add("고주몽");
	}
	// get만
	public List<String> getEmpList() {
		return empList;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> tmp = new ArrayList<>();
		for(String s : empList) {
			tmp.add(s);
		}
		return new Employee(tmp);
	}
	@Override
	public String toString() {
		return "Employee [empList=" + empList + "]";
	}
	
}
