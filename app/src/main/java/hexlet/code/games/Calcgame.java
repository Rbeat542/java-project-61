package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Calcgame {
    public static void game() {
        Engine.game("Calcgame", "What is the result of the expression?" );
    }

    public static void gameLogic(String nameOfUser) {
        var rand = new Random();
        Scanner in = new Scanner(System.in);
        var random1 = rand.nextInt(10);
        var random2 = rand.nextInt(10);
        var random3 = rand.nextInt(3);
        int answer = 999;
        int calculation = 0;
        String[] operationsArray = {"+", "-", "*"};
        var operation = operationsArray[random3];
        System.out.println("Question: " + random1 + operation + random2);
        System.out.print("Your answer: ");
        if (in.hasNextInt()) {
            answer = in.nextInt();
        } else {
            //System.out.println("Извините, но это не число. Попробуйте снова!");
        }
        switch (operation) {
            case "+":
                calculation = random1 + random2;// Делаем раз
                break;
            case "*":
                calculation = random1 * random2;
                break;
            case "-":
                calculation = random1 - random2;
                break;
        }

        if (answer == calculation) {
            System.out.println("Correct!");
        } else {
            if (answer != 999) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(.");
            }
            System.out.println("Correct answer was '" + calculation + "'");
            System.out.println("Let's try again," + nameOfUser);
        }
        //in.close(); // closing of Scanner here is wrong
    }
}
