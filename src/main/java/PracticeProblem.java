/**
 * File: While loops
 * Author: Mikah Ho
 * Date Created: Apr 9, 2026
 * Date Last Modified: Apr 9, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {

		System.out.println(evenSum(9, 2));

	}

	//q1
	public static String repeatLetter(char letter, int num) {

		String letters = "";

		for (int i = 0; i < num; i++) {

			letters = letters + letter;
		}

		return letters;
	}

	//q2
	public static int countLetter(String word, char letter) {

		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			
			if (word.charAt(i) == letter) {

				count = count + 1;
			}
		}

		return count;
	}

	//q3
	public static int evenSum(int num1, int num2) {

		int sum = 0;

		if (num1 < num2) {

			for (int i = num1; i <= num2; i++) {

				if (i % 2 == 0) {

					sum = sum + i;
				}
			}
		}
		else {
		
			for (int i = num2; i <= num1; i++) {

				if (i % 2 == 0) {

					sum = sum + i;
				}
			}
		}
	
		return sum;

	}

}
