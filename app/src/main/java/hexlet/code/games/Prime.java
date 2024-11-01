package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void game() {
        Engine.gamestart("Primegame", "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static int gameLogic(String nameOfUser) {
        var rand = new Random();
        Scanner in = new Scanner(System.in);
        int signalToQuitLoop = 0;
        final int random = rand.nextInt(99);
        System.out.println("Question: " + random);
        System.out.print("Your answer: ");
        String answer = in.nextLine();
        String primeCheckResult = isPrime(random);
        if (answer.equals(primeCheckResult)) {
            System.out.println("Correct!");
        } else {
            errorDisplay(answer, primeCheckResult);
            System.out.println("Let's try again, " + nameOfUser + "!");
            signalToQuitLoop = 1;
        }
        return signalToQuitLoop;
    }

    public static void errorDisplay(String answer2, String primeCheckResult2) { //new
        System.out.println("'" + answer2 + "'" + " is wrong answer ;(.");
        System.out.println("Correct answer was '" + primeCheckResult2 + "'");
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
