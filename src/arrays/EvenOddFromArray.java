package arrays;

public class EvenOddFromArray {

	public static void main(String[] args) {
		int even = 0;
		int odd = 0;
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Even Numbers: ");
		for (int num : a) {
			if (num % 2 == 0) {
				even = num;
				System.out.println(even + " ");

			}
			System.out.println("Odd Numbers: ");
			for (int numone : a) {
				if (numone % 2 != 0) {
					odd = numone;
					System.out.println(odd + " ");
				}
			}

		}

	}

}
