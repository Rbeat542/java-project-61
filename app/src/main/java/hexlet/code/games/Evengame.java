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
        var random = rand.nextInt(99);
        Scanner in2 = new Scanner(System.in);
        System.out.println("Question: " + random);
        System.out.print("Your answer: ");
        String answer = in2.nextLine();
        if (answer.equals(isEven(random))) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(.");
            System.out.println("Correct answer was '" + isEven(random) + "'");
            System.out.println("Let's try again," + nameOfUser);
        }
        //in2.close();   // closing of Scanner here is wrong
    }

    private static String isEven(int rand) {
        if (rand % 2 == 0) {
            return "yes";
        } return "no";
    }
}