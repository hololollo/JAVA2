package sec3;

public class SingletonEx {

	public static void main(String[] args) {
		Singleton ins1 = Singleton.getInstance(); // 기본 디폴트값 null
		Singleton ins2 = Singleton.getInstance();
		Singleton ins3 = Singleton.getInstance();

		System.out.println(ins1);
		System.out.println(ins2);
		System.out.println(ins3);

		System.out.println((ins1==ins2) + ":" + (ins2==ins3));
		
	}

}
