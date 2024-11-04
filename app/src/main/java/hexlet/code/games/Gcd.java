package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Scanner;

public class Gcd {
    public static void start() {
        Engine.gameStart("Find the greatest common divisor of given numbers.");
        Scanner in = new Scanner(System.in);
        String[] answers = new String[2];
        int i = 1;
        final int gamesCount = 3;
        while (i <= gamesCount) {
            final int limit = 19;
            int random1 = Utils.generateRandom(limit) + 1;
            int random2 = Utils.generateRandom(limit) + 1;
            System.out.println("Question: " + random1 + " " + random2);
            System.out.print("Your answer: ");
            answers[0] = in.nextLine();
            answers[1] = Integer.toString(gcd(random1, random2));
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

    public static int gcd(int a, int b) {
        return  (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}

