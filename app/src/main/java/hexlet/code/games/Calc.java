package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void start() {
        Engine.gameStart("What is the result of the expression?");
        Scanner in = new Scanner(System.in);
        String[] answers = new String[2];
        String operation = getRandomOperator();
        int i = 1;
        final int gamesCount = 3;
        while (i <= gamesCount) {
            final int limit = 10;
            int random1 = Utils.generateRandom(limit);
            int random2 = Utils.generateRandom(limit);
            System.out.println("Question: " + random1 + " " + operation + " " + random2);
            System.out.print("Your answer: ");
            answers[0] = in.nextLine();
            answers[1] = getCorrectAnswer(random1, random2, operation);
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

    public static String getCorrectAnswer(int operator1, int operator2, String operation) {
        int calculation = 0;
        switch (operation) {
            case "+":
                calculation = operator1 + operator2;
                break;
            case "*":
                calculation = operator1 * operator2;
                break;
            case "-":
                calculation = operator1 - operator2;
                break;
            default:
                break;
        }
        return Integer.toString(calculation);
    }

    private static String getRandomOperator() {
        Random rand = new Random();
        String[] operationsArray = {"+", "-", "*"};
        final int random3 = rand.nextInt(3);
        return operationsArray[random3];
    }
}
