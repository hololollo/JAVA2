package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
// 예외 떠넘기기
public class ThrowsExam {

	public static void main(String[] args) throws FileNotFoundException, IOException  { // 떠넘기기
		FileInputStream fis = null;
		String absolutePath = "d: \\kang\\java2\\test14\\bin\\sec2\\a.txt"; //절대경로
		String relativePath = "./a.txt"; // 상대경로 -> 현재 디렉토리(폴더)
		String relativePath2 = "../a.txt"; // 상대경로 -> 상위 디렉토리
		String relativePath3 = "../../a.txt"; // 상대경로 -> test14디렉토리 안에
		fis = new FileInputStream(absolutePath); // 절대경로
		if(fis != null) {
			fis.close();
		}
	}

}
