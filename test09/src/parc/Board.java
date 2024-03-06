package parc;

public class Board {
	
	private int bno;
	private int resdate;
	private int visited;
	private String title;
	private String uname;
	private String content;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getResdate() {
		return resdate;
	}
	public void setResdate(int resdate) {
		this.resdate = resdate;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Board(int bno, int resdate, int visited, String title, String uname, String content) {
		this.bno = bno;
		this.resdate = resdate;
		this.visited = visited;
		this.title = title;
		this.uname = uname;
		this.content = content;
	}
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", resdate=" + resdate + ", visited=" + visited + ", title=" + title + ", uname="
				+ uname + ", content=" + content + "]";
	}

}
	
			

	
	
