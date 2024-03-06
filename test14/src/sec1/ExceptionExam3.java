package sec1;
// ArrayIndexOutOfBoundsException : 배열의 범위를 초과하는 경우 발생
public class ExceptionExam3 {
	public static void main(String[] args) {
		int[] nArr = {90,85,100};
		int i = 0;
		while(i <= 3) { // ArraIndexOutOfBound
			try { // 정상일때 출력 
			System.out.println(nArr[i]);
			i++;
			}catch(ArrayIndexOutOfBoundsException e) { // 오류가 있을지도 모를 때 혹시몰라서 실행
			e.getMessage();
			}catch(Exception e) { // 오류일때 실행
				e.printStackTrace();
			}finally { // 예외가 발생하든 아니든 무조건 실행
				System.out.println("작업종료"); // 성공(try) 수행이든 실패(catch)이든 작업 후 반드시 실행(finally)
				
			}
		}
	}
}
