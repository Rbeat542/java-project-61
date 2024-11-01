package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Gcdgame {
    public static void game() {
        Engine.game("Gcdgame", "Find the greatest common divisor of given numbers.");
    }

    public static void gameLogic(String nameOfUser) {
        var rand = new Random();
        Scanner in = new Scanner(System.in);

        int i = 1;
        final int upperLimit = 19; // задан верхний предел для генерации чисел, чтобы не быть сложным для подсчета.
        final int gamesCount  = 3; // задан верхний предел количества попыток игры
        while (i <= gamesCount) {
            var random1 = rand.nextInt(upperLimit) + 1;  // избавляемся от 0 после генерации случайного числа
            var random2 = rand.nextInt(upperLimit) + 1;
            int answer = 0;
            int flagOfInt = 1;
            String textAnswer = "";
            System.out.println("Question: " + random1 + " " + random2);
            System.out.print("Your answer: ");
            if (in.hasNextInt()) {
                answer = in.nextInt();
            } else {
                textAnswer = in.next();
                //System.out.println("Извините, но это не число. Попробуйте снова!");
                flagOfInt = 0;
            }

            if (answer == gcd(random1, random2)) {
                System.out.println("Correct!");
                i++;
            } else {
                if (flagOfInt == 1) {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(.");
                } else {
                    System.out.println("'" + textAnswer + "'" + " is wrong answer ;(.");
                }

                System.out.println("Correct answer was '" + gcd(random1, random2) + "'");
                System.out.println("Let's try again, " + nameOfUser + "!");
                break;
            }
            if (i > gamesCount) {
                System.out.println("Congratulations, " + nameOfUser + "!");
            }
        }
    }

    public static int gcd(int a, int b) {  //метод взят с hexlet
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }

}

