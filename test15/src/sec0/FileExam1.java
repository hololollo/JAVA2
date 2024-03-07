package sec0;
// ★파일 입출력★
import java.io.File;
import java.io.IOException;

public class FileExam1 {
	public static void main(String[] args) throws IOException {
		String file1 = "d:\\kang\\java2\\a.txt"; // 로컬경로(\로 표시)
		String file2 = "http://192.168.1.104/data/menual/java.txt"; // 원격(웹)경로 => URL(/로 표시)
		File f1 = new File(file1); // file은 무조건 예외처리가 필요하다.
		
		String fileName = f1.getName();
		System.out.println(fileName); // 경로는 출력이 안되고 a.txt라는 이름만 출력
		int pos = fileName.lastIndexOf("."); // 마지막으로 위치한 . 의 위치(개수)를 찾는다
		System.out.println("확장자와 파일명의 구분을 나타내는 점의 위치 : " + pos);
		System.out.println("확장자를 제외한 파일의 이름 : " + fileName.substring(0, pos));
		System.out.println("확장자 : " + fileName.substring(pos+1));
		System.out.println("경로를 포함한 파일의 이름(절대경로) : " + f1.getAbsolutePath());
		System.out.println("경로를 포함한 파일의 이름(상대경로) : " + f1.getPath()); // DB에 URL(파일의 주소)을 담을 때
		System.out.println("파일이 속해있는 상위(부모) 디렉토리 : " + f1.getParent());
		System.out.println("경로 구분자 : " + File.separator); // 상수 처리, file.separatorChar 와 동일
		
		// 시스템 변수값 가져오기 => System.getProperty("시스템 변수명")
		System.out.println("현재 사용자 디렉토리(user.dir) : " + System.getProperty("user.dir"));
		System.out.println("자바 사용자 디렉토리(sun.boot.class.path) : " + System.getProperty("sun.boot.class.path"));
		// => 정식판이 아닌 open jdk 이기 때문에 null값 출력..
		System.out.println("운영체제(OS) 환경변수 값 : " + System.getenv()); // 환경변수 값(전체 출력)
		System.out.println("JAVA_HOME : " + System.getenv("JAVA_HOME")); // 특정 (JAVA_HOME) 환경변수 값

	}

}
