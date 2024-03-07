package sec1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
	public static void main(String[] args) throws IOException {
		File file = new File("e.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		BufferedWriter fw = new BufferedWriter( new FileWriter(file, true));
		
		fw.write("뭐라는거야");
		fw.newLine(); // 줄 바꿈
		fw.write("어처구니가 없네 진짜");
		fw.newLine(); // 줄 바꿈
		fw.write("갈수록 태산이야");
		fw.flush(); // 메모리에서 불러옴
		fw.close();
		
	}

}
