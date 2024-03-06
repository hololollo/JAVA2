package sec4;

public class ShopExam {

	public static void main(String[] args) {
		Shop s;
		Delivery d;
		
		s = new Shop();
		d = new Shop();
		
		s.buy();
		s.sell();
		s.delivery();
		
		d.buy();
		d.sell();
		d.delivery();
		
	}

}
