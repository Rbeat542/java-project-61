package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Evengame {
    public static void game() {
        Engine.game("Evengame", "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static void gameLogic(String nameOfUser) {
        var rand = new Random();
        Scanner in2 = new Scanner(System.in);
        var i = 1;
        final int gamesCount  = 3; // задан верхний предел количества попыток игры
        while (i <= gamesCount) {
            final int random = rand.nextInt(99);
            System.out.println("Question: " + random);
            System.out.print("Your answer: ");
            String answer = in2.nextLine();
            if (answer.equals(isEven(random))) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(.");
                System.out.println("Correct answer was '" + isEven(random) + "'");
                System.out.println("Let's try again, " + nameOfUser + "!");
                break;
            }
            if (i > gamesCount) {
                System.out.println("Congratulations, " + nameOfUser + "!");
            }
        }
    }

    private static String isEven(int rand) {
        if (rand % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
