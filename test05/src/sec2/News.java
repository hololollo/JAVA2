package sec2;
// 탑다운(Top-Down)방식의 생성자 함수
public class News {
	private int bno;
	private String title;
	private String admin;
	private String content;
	private String resdate;
	private int visited;
	
	// this() -> 해당 필드(news)를 의미한다.
	// this() -> 일일이 생성자 변수를 선언하지 않아도 마지막
	public News() {
		this(1);
	}		
	
	public News(int bno) {
		this(bno, "자바는");
	}		
	
	public News(int bno, String title) {
		this(bno, title, "admin");
	}	
	
	public News(int bno, String title, String admin) {
		this(bno, title, admin, "자바");
	}	
	
	public News(int bno, String title, String admin, String content) {
		this(bno, title, admin, content, "2024-02-23");
	}

	public News(int bno, String title, String admin, String content, String resdate) {
		this(bno, title, admin, content, resdate, 0);
	}

	public News(int bno, String title, String admin, String content, String resdate, int visited) {
		this.bno = bno;
		this.title = title;
		this.admin = admin;
		this.content = content;
		this.resdate = resdate;
		this.visited = visited;
	}

	@Override
	public String toString() {
		return "News [bno=" + bno + ", title=" + title + ", admin=" + admin + ", content=" + content + ", resdate="
				+ resdate + ", visited=" + visited + "]";
	}
	
	
	
}
