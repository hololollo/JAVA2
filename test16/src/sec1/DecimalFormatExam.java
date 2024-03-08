package sec1;

import java.text.DecimalFormat;

// DecimalFormat : 숫자의 표시형식을 지정하여 활용하는 클래스
public class DecimalFormatExam {
	public static void main(String[] args) {
		// 표시 형식 코드 : 0(숫자가 안와도 무조건 표시) ,(천단위 구분기호) #(숫자가 없으면 따로 표시X) E(지수) %(백분율)
		// 1234.56 변환
		// 0 => 1234, 0.0 => 1234.5, 000000.000000 => 001234.560000 
		// # => 1234, #.# => 1234.5, ######.###### => 1234.56 
		
		// -1234 변환
		// -#, -0 => -1234
		// #-, 0- => 1234-
		// #,##0 => -1,234
		// #E0 => 1,1234E+03(지수)
		// #% => -123400%
		
		double n = 1234567.89;
		DecimalFormat df1 = new DecimalFormat("#,##0.0000");
		DecimalFormat df2 = new DecimalFormat("0,000.####");
		//DecimalFormat df3 = new DecimalFormat("0;#,##0;-#,##0"); // 자바 1.6이상부터 사용X
		
		String res1 = df1.format(n);
		String res2 = df2.format(n);
		
		
		System.out.println("#,##0.0000 : " + res1);
		System.out.println("0,000.#### : " + res2);
		
		
		
		
	}

}
