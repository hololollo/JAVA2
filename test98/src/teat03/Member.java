package teat03;

/*
  회원의 정보를 저장하고 출력하기 위하여 Member클래스와 활용 코드를 작성하였지만 오류 발생 및 정상 수행되지 않았다.  
Member 클래스 및 소스코드를 분석하여 원인(문제 발생 지점 + 문제 발생 원인) 및 조치내용(해결방안 + 수정된 코드)을 작성하시오.
 */
public class Member {
	//필드
	private String name;
	private String age;
	private String address;
	private String hobby;
	
	//생성자
	/*
	public Member() {
	}
	*/
	/*
		public Member(String name, String age, String address, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.hobby = hobby;
	}
*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	

	
	
	
	
}
