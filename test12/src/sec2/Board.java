package sec2;

public class Board {
	private int bno;
	private String title;
	private String count;
	private String date;
	
	
	public Board() {}
	public Board(int bno, String title, String count, String date) {
		super();
		this.bno = bno;
		this.title = title;
		this.count = count;
		this.date = date;
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
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", count=" + count + ", date=" + date + "]";
	}
	
	
}
