package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Gcdgame {
	public static void game() {
		Engine.game("Gcdgame", "Find the greatest common divisor of given numbers." );
	}

	public static void gameLogic(String nameOfUser) {
		var rand = new Random();
		Scanner in = new Scanner(System.in);
		var random1 = rand.nextInt(19) + 1;
		var random2 = rand.nextInt(19) + 1;
		int answer = 0;
		int flagOfInt = 1;
		String textAnswer = "";
		System.out.println("Question: " + random1 + " " + random2);
		System.out.print("Your answer: ");
		if (in.hasNextInt()) {
			answer = in.nextInt();
		} else {
			textAnswer = in.next();
			//System.out.println("Извините, но это не число. Попробуйте снова!");
			flagOfInt = 0;
		}

		if (answer == gcd(random1, random2)) {
			System.out.println("Correct!");
		} else {
			if (flagOfInt == 1) {
				System.out.println("'" + answer + "'" + " is wrong answer ;(.");
			} else {
				System.out.println("'" + textAnswer + "'" + " is wrong answer ;(.");
			}

			System.out.println("Correct answer was '" + gcd(random1, random2) + "'");
			System.out.println("Let's try again," + nameOfUser);
		}
		//in.close(); // closing of Scanner here is wrong
	}

	public static int gcd(int a, int b) {  //метод взят с hexlet
		return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
	}

}

