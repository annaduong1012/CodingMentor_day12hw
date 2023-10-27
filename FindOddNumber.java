package day12.homework;

public class FindOddNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15 };
		findOddCountNum(arr);
	}

	public static void findOddCountNum(int[] array) {
		int max = array[0]; // max supposingly the largest num in the array

		for (int num : array) {
			if (num > max) {
				max = num;
			}
		}
		int countArr[] = new int[max + 1]; // defines countArr size

		for (int num : array) {
			countArr[num]++;
		}
		System.out.print("Numbers that appear odd times: ");
		for (int i = 0; i <= max; i++) {
			if (countArr[i] % 2 != 0) {
				System.out.print(i + " ");
			}
		}

		// Time Complexity O(n)

	}
}