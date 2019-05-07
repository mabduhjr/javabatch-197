package day03;

public class ArrayExample023 {

	public static void main(String[] args) {

		int a[] = { 33, 3, 4, 5 };
		//min(a);
		// TODO Auto-generated method stu
	}

	static void min(int arr[]) {
		int min = arr[0];
		// System.out.println(arr.length);
		for (int x = 1; x < arr.length; x++) {
			if (min > arr[x])
				min = arr[x];

			System.out.println(min);

		}
	}

}
