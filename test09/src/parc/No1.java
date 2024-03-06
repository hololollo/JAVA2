package parc;

import java.util.Scanner;

public class No1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int protain;
		int carb;
		int fat;
		double calorie;
		System.out.print("단백질 함량을 입력해 주세요 : ");
		protain = scn.nextInt();
		System.out.print("탄수화물 함량을 입력해 주세요 : ");
		carb = scn.nextInt();
		System.out.print("지방 함량을 입력해 주세요 : ");
		fat = scn.nextInt();
		calorie = (protain * 4) + (carb * 4) +(fat * 9);
		System.out.println("칼로리는 :" + calorie + "kcal 입니다.");
	}
}
