package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progressiongame {
	public static void game() {
		Engine.game("Progressiongame", "What number is missing in the progression?" );
	}

	public static void gameLogic(String nameOfUser) {
		var rand = new Random();
		Scanner in = new Scanner(System.in);
		String stringToDisplay = "";
		int answer = 0;
		int correctAnswer = 999;
		int[] arrayOfInt  = new int [10];
		var random1 = rand.nextInt(80);
		var random2 = rand.nextInt(9);
		int flagOfInt = 1;
		//System.out.println("Starting digit = " + random1);
		//System.out.println("Position in array to guess " + random2);
		for (int i = 0; i < 10; i++ ) {  //заполнение массива из 10 цифр
			arrayOfInt[i] = random1 + i;
			if (i == random2) {
				stringToDisplay = stringToDisplay + " " + "..";
				correctAnswer = arrayOfInt[i];
			} else {
				stringToDisplay = stringToDisplay + " " + arrayOfInt[i];
			}
			}
		String textAnswer = "";
		System.out.println("Question: " + stringToDisplay);
		System.out.print("Your answer: ");
		if (in.hasNextInt()) {
			answer = in.nextInt();
		} else {
			textAnswer = in.next();
			//System.out.println("Извините, но это не число. Попробуйте снова!");
			flagOfInt = 0;
		}

		if (answer == correctAnswer) {
			System.out.println("Correct!");
		} else {
			if (flagOfInt == 1) {
				System.out.println("'" + answer + "'" + " is wrong answer ;(.");
			} else {
				System.out.println("'" + textAnswer + "'" + " is wrong answer ;(.");
			}

			System.out.println("Correct answer was '" + correctAnswer + "'");
			System.out.println("Let's try again," + nameOfUser);
		}
		//in.close(); // closing of Scanner here is wrong
 	}
}

