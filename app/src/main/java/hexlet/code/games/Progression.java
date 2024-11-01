package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void game() {
        Engine.gamestart("Progressiongame", "What number is missing in the progression?");
    }

    public static int gameLogic(String nameOfUser) {
        var rand = new Random();
        Scanner in = new Scanner(System.in);
        int signalToQuitLoop = 0;
        String stringToDisplay = "";
        int answer = 0;
        int correctAnswer = 0;
        final int progressionLength = 10;
        int[] arrayOfInt = new int[progressionLength];
        final int random1 = rand.nextInt(80); // генерируем начальное число прогрессии
        final int random2 = rand.nextInt(9);
        int flagOfInt = 1;
        final int digitsInRow = 9;
        for (int i2 = 0; i2 <= digitsInRow; i2++) {  //заполнение массива из 10 цифр
            arrayOfInt[i2] = random1 + i2;
            if (i2 == random2) {
                stringToDisplay = stringToDisplay + " " + "..";
                correctAnswer = arrayOfInt[i2];
            } else {
                stringToDisplay = stringToDisplay + " " + arrayOfInt[i2];
            }
        }
        stringToDisplay = stringToDisplay.trim();
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
            errorDisplay(answer, correctAnswer, textAnswer, flagOfInt);
            System.out.println("Let's try again, " + nameOfUser + "!");
            signalToQuitLoop = 1;
        }
        return signalToQuitLoop;
    }

    public static void errorDisplay(int answer2, int result, String textAnswer2, int flag2) { //new
        if (flag2 == 1) {
            System.out.println("'" + answer2 + "'" + " is wrong answer ;(.");
        } else {
            System.out.println("'" + textAnswer2 + "'" + " is wrong answer ;(.");
        }
        System.out.println("Correct answer was '" + result + "'");
    }
}
