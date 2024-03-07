package sec1;
// 파일 / 키보드 / 데이터 입력 : FileInputStream, BufferedInputStream, FileReader, BufferedReader
// 파일 / 모니터 / 데이터 출력 : FileOutputStream, BufferedOutputStream, FileWriter, BufferedWriter
// Stream으로 끝나는 클래스는 데이터 입출력을 바이트 단위로 : FileInputStream, BufferedInputStream / FileOutputStream, BufferedOutputStream
// Stream으로 끝나지 않는 클래스는 데이터 입출력을 문자 단위로 :FileReader, BufferedReader / FileWriter, BufferedWriter
public class StreamExam {
	public static void main(String[] args) {
		String fileInputStream = "FileInputStream는 바이트 단위로 입력하기 위한 스트림";
		String BufferedInputStream = "BufferedInputStream는 바이트 단위로 입력하기 위한 스트림 : 메모리 버퍼로 로딩 후";
		String fileReader = "fileReader는 문자 단위로 입력하기 위한 스트림";
		String BufferedReader = "BufferedReader는 문자 단위로 입력하기 위한 스트림 : 메모리 버퍼로 로딩 후";
		String fileOutputStream = "fileOutputStream는 바이트 단위로 출력하기 위한 스트림";
		String BufferedOutputStream = "BufferedOutputStream는 바이트 단위로 출력하기 위한 스트림 : 메모리 버퍼를 활용";
		String fileWriter = "fileWriter는 문자단위로 출력하기 위한 스트림";
		String BufferedWriter = "BufferedWriter는 문자 단위로 출력하기 위한 스트림 : 메모리 버퍼를 활용";
		System.out.println(fileInputStream);
		System.out.println(BufferedInputStream);
		System.out.println(fileReader);
		System.out.println(BufferedReader);
		System.out.println(fileOutputStream);
		System.out.println(BufferedOutputStream);
		System.out.println(fileWriter);
		System.out.println(BufferedWriter);

		
	}

}
