package org.kh.object1;
/*
public : 전체에서 사용(같은 패키지 내에서)
protected : 같은 패키지 내에서 사용, 상속을 받은 경우 사용, 연관된 경우 (같은 패키지이거나 자식 클래스에서 접근이 가능하다.)
(default) : 같은 패키지 내에서만 사용
private : 해당 클래스 내에서만 사용(객체지향형 특징 -> 정보은닉성 (캡슐화)) public 메서드로 불러와서 사용함.(getter, setter:특정값으로 저장할 수 있게 해준다.)
*/
public class Member {
	private String id;
	private String email;
	private int pw;
	private int birth;
	private String tel;
	
	// 마우스 오른쪽버튼 - source - generate getter setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPw() {
		return pw;
	}

	public void setPw(int pw) {
		this.pw = pw;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	// 매개변수와 동일할 경우는 this.를 넣어야함.(혼동되지 않도록 정해져있음.) -> 불러올 값을 매개변수에 넣어주는 행위 : setter / 불러오는 행위 : getter
	// 매개변수 : 임시기억장소
	@Override // : 상속받아서 내용을 바꿔서 정의하는 것. (오브젝트 클래스-오버라이드)
	// 마우스오른쪽버튼 - source - generate toString()
	public String toString() {
		return "Member [id=" + id + ", email=" + email + ", pw=" + pw + ", birth=" + birth + ", tel=" + tel + "]";
	}
}
