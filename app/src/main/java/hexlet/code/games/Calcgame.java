package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Calcgame {
    public static void game() {
        Engine.game("Calcgame", "What is the result of the expression?");
    }

    public static void gameLogic(String nameOfUser) {
        var rand = new Random();
        Scanner in = new Scanner(System.in);
        int i = 1;
        final int gamesCount  = 3; // задан верхний предел количества попыток игры
        while (i <= gamesCount) {
            final int random1 = rand.nextInt(10); // задаем число 1
            final int random2 = rand.nextInt(10); // задаем число 2
            final int random3 = rand.nextInt(3);  // задаем число 0..2 для выбора случайной арифметической операции
            int answer = 0;
            String textAnswer = "";
            int calculation = 0;
            int flagOfInt = 1;
            String[] operationsArray = {"+", "-", "*"};
            var operation = operationsArray[random3];
            System.out.println("Question: " + random1 + " " + operation + " " + random2);
            System.out.print("Your answer: ");
            if (in.hasNextInt()) {
                answer = in.nextInt();
            } else {
                flagOfInt = 0;
                //System.out.println("Извините, но это не число. Попробуйте снова!");
                textAnswer = in.next();
            }
            switch (operation) {
                case "+":
                    calculation = random1 + random2; // Делаем раз
                    break;
                case "*":
                    calculation = random1 * random2;
                    break;
                //case "-":
                default:
                    calculation = random1 - random2;
                    break;
            }
            if (answer == calculation) {
                System.out.println("Correct!");
                i++;
            } else {
                if (flagOfInt == 1) {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(.");
                } else {
                    System.out.println("'" + textAnswer + "'" + " is wrong answer ;(.");
                }
                System.out.println("Correct answer was '" + calculation + "'");
                System.out.println("Let's try again, " + nameOfUser + "!");
                break;
            }
            if (i > gamesCount) {
                System.out.println("Congratulations, " + nameOfUser + "!");
            }
        }
    }
}
