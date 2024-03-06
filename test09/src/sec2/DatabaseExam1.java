package sec2;

public class DatabaseExam1 {
	public static void main(String[] args) {
	Database db; // 객체 선언
	
	System.out.println("\nOracle");
	db = new Oracle();
	db.connect(Oracle.URL, Oracle.PORT + "", Oracle.ID, Oracle.PW);
	db.select("board", " where title like \'%\' + 알림 + \'%\'");
	db.insert("board", "\'제목10\'", 10);
	
	System.out.println("\nMySQL");
	db = new Oracle();
	db.connect(Oracle.URL, Oracle.PORT + "", Oracle.ID, Oracle.PW);
	db.select("board", " where title like \'%\' + 알림 + \'%\'");
	db.insert("board", "\'제목10\'", 11);
	
}
}
