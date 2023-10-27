package day12.homework;

import java.util.ArrayList;
import java.util.List;

public class FindSquareInt {

	public static void main(String[] args) {
		int lowerRange = 0;
		int upperRange = 10;
		findSquareNum(lowerRange, upperRange);
	}

	public static void findSquareNum(int a, int b) {
		ArrayList<Integer> squareNum = new ArrayList<>();

		for (int i = a; i <= b; i++) {
			int sqrt = (int) Math.sqrt(i);
			if (sqrt * sqrt == i) {
				squareNum.add(i);
			}
		}
		System.out.println("The square number in this range is " + squareNum);
	}
}

//Time complexity: O(n)
