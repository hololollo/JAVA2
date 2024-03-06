package sec2;

public class Bus {
	//필드 세개
	int no;
	int count; // 승객수
	int fee;
	
	
	//객체 생성시 노선번호(no)만 입력받는 생성자 함수
	public Bus(int num) {
		this.no = num;
	}
	
	//승객이 버스를 타면 행해지는 일 : 승객수 증가, 버스 수입 증가(누적)
	
	public void take(int money) {
		this.fee += money; // fee = fee + money
		count++; // count = count + 1
	}
	
	// 버스의 현재 정보 출력 (직접 해도 되고, 오버라이드 써도 되고)
	public void show() {
		System.out.println("버스 번호 : " + this.no + "수입금액 : " + this.fee + "승객수 : " + this.count);
	}
	
	public int getNum() {
		return no;
	}

	public void setNum(int num) {
		this.no = num;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	

	

	
	
	
}
