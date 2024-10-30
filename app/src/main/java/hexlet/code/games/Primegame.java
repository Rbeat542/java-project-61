package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Primegame {
	public static void game() {
		Engine.game("Primegame", "Answer 'yes' if given number is prime. Otherwise answer 'no'");
	}

	public static void gameLogic(String nameOfUser) {
		var rand = new Random();
		var random = rand.nextInt(99);
		Scanner in = new Scanner(System.in);
		System.out.println("Question: " + random);
		System.out.print("Your answer: ");
		String answer = in.nextLine();
		if (answer.equals(isPrime(random)))  {
			System.out.println("Correct!");
		} else {
			System.out.println("'" + answer + "'" + " is wrong answer ;(.");
			System.out.println("Correct answer was '" + isPrime(random) + "'");
			System.out.println("Let's try again," + nameOfUser);
		}
		//in.close(); // closing of Scanner here is wrong
	}

	private static String isPrime(int number) {  //метод взят с hexlet , но вместо while  --> for
		if (number < 2) {
			return "no";
		}
		for (var i = 2; i <= (number / 2); i++) {
			if (number % i == 0) {
				return "no";
			}
		}
		return "yes";
	}
}