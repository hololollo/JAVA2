package sec2;
//ArrayList
public class Member {
	private String name;
	private int birth;
	private String id;
	private String pw;
	private String email;
	
	public Member() {}
	public Member(String name, int birth, String id, String pw, String email) {
		super();
		this.name = name;
		this.birth = birth;
		this.id = id;
		this.pw = pw;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", birth=" + birth + ", id=" + id + ", pw=" + pw + ", email=" + email + "]";
	}
	
	
}
