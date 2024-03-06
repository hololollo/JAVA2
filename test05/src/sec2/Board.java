package sec2;

public class Board {
	private int bno;
	private String title;
	private String admin;
	private String content;
	private String author;
	private int visited;
	
	// source - generate Constructor using Field (super()삭제)
	public Board() {
	}
	public Board(int bno) {
		this.bno = bno;
	}
	
	public Board(int bno, String title) {
		this.bno = bno;
		this.title = title;
	}
	
	public Board(int bno, String title, String admin) {
		this.bno = bno;
		this.title = title;
		this.admin = admin;
	}

	public Board(int bno, String title, String admin, String content) {
		this.bno = bno;
		this.title = title;
		this.admin = admin;
		this.content = content;
	}
	

	public Board(int bno, String title, String admin, String content, String author) {
		this.bno = bno;
		this.title = title;
		this.admin = admin;
		this.content = content;
		this.author = author;
	}
	
	public Board(int bno, String title, String admin, String content, String author, int visited) {
		this.bno = bno;
		this.title = title;
		this.admin = admin;
		this.content = content;
		this.author = author;
		this.visited = visited;
	}


	public int getBno() {
		return bno;
	}
	
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", admin=" + admin + ", content=" + content + ", author="
				+ author + ", visited=" + visited + "]";
	}
	
	
}
