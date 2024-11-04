package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Scanner;

public class Even {

    public static void start() {
        Engine.gameStart("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner in2 = new Scanner(System.in);
        String[] answers = new String[2];
        int i = 1;
        final int gamesCount = 3;
        while (i <= gamesCount) {
            final int limit = 99;
            int random = Utils.generateRandom(limit);
            System.out.println("Question: " + random);
            System.out.print("Your answer: ");
            answers[0] = in2.nextLine();
            answers[1] = getCorrectAnswer(random);
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

    private static String getCorrectAnswer(int rand) { //is even
        if (rand % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
