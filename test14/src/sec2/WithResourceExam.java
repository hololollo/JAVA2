package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class AutoResource implements AutoCloseable { // AutoCloseable은 열린 객체를 자동으로 닫아주는 

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 자동으로 close 되었습니다.");
	}
	
}

public class WithResourceExam {
	public static void main(String[] args) throws Exception {	
		// try ~ with ~ resource : 열린 리소스(파일 포함)는 모두 닫힌다.
			try(AutoResource obj = new AutoResource()) {
				throw new Exception();
			} catch (IOException e) { // I/O 오류(입출력)가 발생하는 경우에 throw되는 예외
				System.out.println("예외부분");
		}
	}
}

