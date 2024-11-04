package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;
import java.util.Scanner;

public class Prime {
    public static void start() {
        Engine.gameStart("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner in = new Scanner(System.in);
        String[] answers = new String[2];
        int i = 1;
        final int gamesCount = 3;
        while (i <= gamesCount) {
            final int limit = 99;
            int random = Utils.generateRandom(limit);
            System.out.println("Question: " + random);
            System.out.print("Your answer: ");
            answers[0] = in.nextLine();
            answers[1] = isPrime(random);
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

    private static String isPrime(int number) {
        if (number < 2) {
            return "no";
        }
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
