package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// FileNotFoundException : 해당 경로에 파일이 존재하지 않는 경우 발생하는 예외
public class ExceptionExam7 {

	public static void main(String[] args) {
		FileInputStream fis = null; // 파일 입력(내용 읽을 목적)
		FileOutputStream ois = null; //파일 출력(내용 저장)
		try {
			fis = new FileInputStream("indata.txt");
			ois = new FileOutputStream("outdata.txt");
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일을 찾을 수 없습니다.");
		}catch(Exception e) {
			System.out.println("원인불명");
			e.printStackTrace();
		}finally {
			System.out.println("작업 종료");
		}
	}		

}
