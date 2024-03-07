package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyExam {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			
		}catch(FileNotFoundException e) {
			System.out.println(e);
			// finally : 예외사항이 try가 되어 성공 수행을 하게 되던지, Exception 되어 실패수행을 하던지 반드시 처리해야 하는 문장
		}finally {
			if (fis != null) {
				try {
					fis.close(); // 없으면 오류
				} catch (IOException e) {
					e.printStackTrace();
				}
			} 
			System.out.println("성공이던지 실패던지 항상 수행 : 작업 종료");
		}
		System.out.println("예외 처리의 다음 문장");
	}

}
