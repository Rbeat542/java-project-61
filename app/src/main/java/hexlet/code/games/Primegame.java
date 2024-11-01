package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Primegame {
    public static void game() {
        Engine.game("Primegame", "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static void gameLogic(String nameOfUser) {
        var rand = new Random();
        Scanner in = new Scanner(System.in);
        int i = 1;
        final int gamesCount  = 3; // задан верхний предел количества попыток игры
        while (i <= gamesCount) {
            final int random = rand.nextInt(99);
            System.out.println("Question: " + random);
            System.out.print("Your answer: ");
            String answer = in.nextLine();
            if (answer.equals(isPrime(random))) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(.");
                System.out.println("Correct answer was '" + isPrime(random) + "'");
                System.out.println("Let's try again, " + nameOfUser + "!");
                break;
            }
            if (i > gamesCount) {
                System.out.println("Congratulations, " + nameOfUser + "!");
            }
        }
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
