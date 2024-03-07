package sec1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

// 바이트 단위로 입력하기 위한 스트림 : 메모리 버퍼 로딩 후
public class BufferedInputStreamExam {
	public static void main(String[] args) throws IOException{
		BufferedInputStream input = null; 
		// input = new BufferedInputStream("a.txt"); // 별도 접근을 못함.
		try {
			input = new BufferedInputStream(new FileInputStream("a.txt")); 
			while(input.available() > 0) {
				System.out.println((char) input.read());
			}
		} catch(Exception e) {
			System.out.println("파일 읽기 실패");
		} finally {
			if(input != null) {
				try {
					input.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
