package sec1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// FileOutputStream : 파일의 내용을 바이트 단위로 쓰기 위한 클래스
public class FileOutputStreamExam {
	public static void main(String[] args) throws IOException{
		File f1 = new File("b.txt");
		if(f1.createNewFile()) {
			System.out.println("File create");
		}else {
			System.out.println("File exists"); // 이미 존재하더라도 작성은 된다.
		}
		String data = "Hello Java";
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(data.getBytes()); // .getByte() : String을 바이트단위의 배열로 변경
		fos.close(); 
	}

}
