package sec4;

public class StoreExam {

	public static void main(String[] args) {
		Inventory store;
		store = new Store();
		store.inverntory();
		//
		
		Pay pay;
		pay = new Pay();
		pay.inverntory();
		pay.pay();
		//
		
		//형 변환 클래스 - 클래스
		pay = new Store();
		pay.inverntory();
		pay.pay();
		//선언은 pay, 
	}

}
