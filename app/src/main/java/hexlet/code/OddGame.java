package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class OddGame {
    public static void main() {
        Scanner in2 = new Scanner(System.in);
        var rand = new Random();
        var user = new User("");
        System.out.print("May I have your name? ");
        String str = in2.nextLine();
        user.setName(str);
        var name = user.getName();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        for (var i = 1; i < 4; i++) {
            var random = rand.nextInt(99);
            System.out.println("Question: " + random);
            System.out.print("Your answer: ");
            String answer = in2.nextLine();
            if (answer.equals(isEven(random))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(.");
                System.out.println("Correct answer was '" + isEven(random) + "'");
                System.out.println("Let's try again," + name);
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    private static String isEven(int rand) {
        if (rand % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
