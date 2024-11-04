package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Scanner;

public class Progression {
    public static void start() {
        Engine.gameStart("What number is missing in the progression?");
        Scanner in = new Scanner(System.in);
        String[] answers = new String[2];
        int correctAnswer = 0;
        final int progressionLength = 10;
        int[] arrayOfInt = new int[progressionLength];
        int i = 1;
        final int gamesCount = 3;
        while (i <= gamesCount) {
            String stringToDisplay = "";
            final int random1 = Utils.generateRandom(80);
            final int random2 = Utils.generateRandom(9);
            final int digitsInRow = 9;
            for (int i2 = 0; i2 <= digitsInRow; i2++) {
                arrayOfInt[i2] = random1 + i2;
                if (i2 == random2) {
                    stringToDisplay = stringToDisplay + " " + "..";
                    correctAnswer = arrayOfInt[i2];
                } else {
                    stringToDisplay = stringToDisplay + " " + arrayOfInt[i2];
                }
            }
            stringToDisplay = stringToDisplay.trim();
            System.out.println("Question: " + stringToDisplay);
            System.out.print("Your answer: ");
            answers[0] = in.nextLine();
            answers[1] = Integer.toString(correctAnswer);
            int flagToExit = Engine.compareAnswers(answers);
            if (flagToExit == 1) {
                break;
            }
            i++;
        }
        if (i > gamesCount) {
            Engine.printGoodbay();
        }
    }
}
