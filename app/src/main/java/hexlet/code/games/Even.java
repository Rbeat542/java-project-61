package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void game() {
        Engine.gamestart("Evengame", "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static int gameLogic(String nameOfUser) {
        var rand = new Random();
        Scanner in2 = new Scanner(System.in);
        int signalToQuitLoop = 0;
        final int random = rand.nextInt(99);
        System.out.println("Question: " + random);
        System.out.print("Your answer: ");
        String answer = in2.nextLine();
        String result =  isEven(random);
        if (answer.equals(result)) {
            System.out.println("Correct!");
        } else {
            errorDisplay(answer, result);
            System.out.println("Let's try again, " + nameOfUser + "!");
            signalToQuitLoop = 1;
        }
        return signalToQuitLoop;
    }


    public static void errorDisplay(String answer2, String result2) { //new
        System.out.println("'" + answer2 + "'" + " is wrong answer ;(.");
        System.out.println("Correct answer was '" + result2 + "'");
    }

    private static String isEven(int rand) {
        if (rand % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
