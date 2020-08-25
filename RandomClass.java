package random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomClass {

	public static void main(String[] args) {

		int start = 0;
		int end = 500;
		int counter = 500;

		int smallest;
		int randomInt;

		int numbers[] = new int[counter];
		Random random = new Random();

		randomInt = random.nextInt(end - start) + start;
		numbers[0] = randomInt;

		smallest = randomInt;


		for (int i = 1; i < counter; i++) {

			numbers[i] = random.nextInt(end - start) + start;

			smallest = Math.min(smallest, numbers[i]);
		}

		System.out.println("Random numbers: " + Arrays.toString(numbers) + "\n\n");

		System.out.println("enter number between 0 and 499 :");

		Scanner numUser = new Scanner(System.in);
		int num = numUser.nextInt();

		while (num > (counter - 1)) {
			System.out.println("enter number between 0 and 499 :");
		}

		System.out.println(num + "th Smallest : " + smallest + "\n");

		System.out.println("Do you want to choose an other number ?(1/0)");

		int val = numUser.nextInt();

		while (val == 1) {
			System.out.println("enter number between 0 and 499 :");

			int num1 = numUser.nextInt();

			while (num > (counter - 1)) {
				System.out.println("enter number between 0 and 499 :");
			}

			while (num1 > counter) {
				System.out.println("enter number between 0 and 499!");
			}
			
			System.out.println(num1 + "th Smallest : " + smallest + "\n");

			System.out.println("Do you want to choose an other number ?(1/0)");

			val = numUser.nextInt();

		}

		if (val == 0) {
			System.out.println("have a geat day!");

		}
		
	}
}
