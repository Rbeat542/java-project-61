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
		var i =1;
		while (i <= 3 ) {
			String stringToDisplay = "";
			int answer = 0;
			int correctAnswer = 999;
			int[] arrayOfInt  = new int [10];
			var random1 = rand.nextInt(80);
			var random2 = rand.nextInt(9);
			int flagOfInt = 1;
			for (int i2 = 0; i2 <=9; i2++ ) {  //заполнение массива из 10 цифр
				arrayOfInt[i2] = random1 + i2;
				if (i2 == random2) {
					stringToDisplay = stringToDisplay + " " + "..";
					correctAnswer = arrayOfInt[i2];
				} else {
					stringToDisplay = stringToDisplay + " " + arrayOfInt[i2];
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
				i++;
			} else {
				if (flagOfInt == 1) {
					System.out.println("'" + answer + "'" + " is wrong answer ;(.");
				} else {
					System.out.println("'" + textAnswer + "'" + " is wrong answer ;(.");
				}

				System.out.println("Correct answer was '" + correctAnswer + "'");
				System.out.println("Let's try again," + nameOfUser);
				break;
			}
			if (i == 4) {
				System.out.println("Congratulations, " + nameOfUser + "!");
			}
		}
	}
}
