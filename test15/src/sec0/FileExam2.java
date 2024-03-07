package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) throws IOException {
		//파일의 상대 경로 지정
		File f1 = new File("a.txt"); // 현재 디렉토리에 파일이 있는 없든 파일 객체 생성
		File f2 = new File("../sec1/a.txt"); // 현재 패키지(디렉토리)는 sec0인데 상위 디렉토리로 이동하여(test15) 같은 경로(sec0, sec1 ...)중  sec1에 있는 a.txt를 생성
		// 파일의 절대 경로 지정
		// d:\\kang\\JAVA2\\a.txt
		File f3 = new File("d + " + File.separator + "kang" + File.separator + "JAVA2" + File.separator + "a.txt"); // d:\kang\JAVA2\a.txt
		String path = "d:\\kang\\JAVA2\\";
		File f4 = new File(path, "a.txt");
		File f5 = new File("d:\\kang\\JAVA2\\", "a.txt");
		/*
		if(f1 == null) {
			System.out.println("파일이 존재하지 않습니다.");
		}else {
			System.out.println("파일이 존재합니다.");
		}
		*/
		
	}

}
