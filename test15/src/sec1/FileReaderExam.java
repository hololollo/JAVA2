package sec1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
// BufferedReader, FileReader : 문자(열) 단위로 읽기
public class FileReaderExam {
/*
	public static void main(String[] args) throws IOException {
		File file = new File("a.txt");
		if(file.exists()) { // 존재할때만 불러오겠다.
			FileReader fr = new FileReader(file);
			while(fr.read() > 0) {
				System.out.println((char) fr.read());
			}
		}
		
		
	}
*/
	public static void main(String[] args) throws IOException {
		File file = new File("d.txt");
		if(file.exists()) { // 존재할때만 불러오겠다.
			FileReader fr = new FileReader(file);
			while(fr.read() > 0) {
				System.out.println((char) fr.read());
			}
		}
		
		
	}
}
