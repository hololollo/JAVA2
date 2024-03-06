package sec2;

public class ArrayCopy2 {

	public static void main(String[] args) {
		int [] arr1 = {80,70,65,90,85,95,60};
		int [] arr2 = {5, 3, 8, 7, 6, 4, 2};
		int [] arr3 = {5, 3, 8, 7, 6, 4, 2};
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);

		for(int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
	}

}
