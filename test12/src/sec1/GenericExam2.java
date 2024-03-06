package sec1;


class StudentMap<K, V> {
	private K key;
	private V value;
	public StudentMap() {}
	public StudentMap(K key, V value) { // Genric - Map구조
		super();
		this.key = key;
		this.value = value;
		
		
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}



public class GenericExam2 {
	public static void main(String[] args) {
		StudentMap<Integer, String> s1 = new StudentMap<>(1, "강범준"); // <>참조형(레퍼런스타입)으로 써야한다.
		StudentMap<Integer, String> s2 = new StudentMap<>(2, "박은성"); 
		StudentMap<Integer, String> s3 = new StudentMap<>(3, "계성우");
		StudentMap<Integer, String> s4 = new StudentMap<>(4, "김동연"); 
		
		StudentMap<String, Integer> s5 = new StudentMap<>("강범준", 90); 
		StudentMap<String, Integer> s6 = new StudentMap<>("박은성", 100);
		
		Student st1 = new Student("김민식", 25);
		StudentMap<Student, Integer> s7 = new StudentMap<>(st1, 100); // 레퍼런스 타입이 아닌경우
		
		
	}

}
