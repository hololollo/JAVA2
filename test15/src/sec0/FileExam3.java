package sec0;
// 디렉토리 생성
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExam3 {
	public static void main(String[] args) throws IOException {
		File f = new File("student");
		f.mkdir(); // test15가 현재 디렉토리이므로 test15 안에 student 디렉토리 생성만.
		
		File f2 = new File("manage/teacher/kt"); // 현재 디렉토리에 manage 안에 teacher 안에 kt파일을 만들것이다.
		f2.mkdirs(); // mkdir : 단일 파일 / mkdirs : 여러 파일
		
		//디렉토리 생성 날짜와 시간 변경하기
		f.setLastModified(new Date().getTime()); // 현재 시간으로 변경
		
		//디렉토리를 읽기 전용으로 변환(파일 넣기, 쓰기, 복사 다 불가능.)
		f.setReadOnly();
		
	}

}
