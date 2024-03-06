package sec4;

public class MarketExam {

	public static void main(String[] args) {
		//인터페이스는 다중상속이 가능하니까.
		Buy buy;
		buy = new Market();
		buy.buy();
		
		Sell sell;
		sell = new Market();
		sell.sell();
		
		
		
	}

}
