package sec2;

public class Subway {
	int no;
	String station;
	int count;
	int fee;
	
	//지하철 노선번호를 매개변수로 받는 생성자 함수
	
	public Subway(int num) {
		this.no = num;
	}
	
	//지하철 승객이 탑승하면 생기는 필드의 변화 : 승객수 증가, 지하철 요금 누적
	
	public void take(int money) {
		this.fee += money;
		count++;
	}
	
	// 현재 지하철 정보 출력
	public void SubwayStatus() {
		System.out.println("노선번호 : " + this.no + "승객 수 : " + this.count + "누적 요금 : " + this.fee);
	}
}
