package sec1;

public interface Calcurator {
	double PI = 3.1415; // 인터페이스에 필드를 선언하면, 상수(final static)이 된다.
	int ERROR = -99999999;
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int multiply(int num1, int num2);
	int divide(int num1, int num2);
	
}
