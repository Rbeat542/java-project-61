package hexlet.code.games;

import hexlet.code.Constant;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;

public class Calc {
    public static void start() {
        Engine.gameStart();
        int gamesCount = Engine.gamesCount();
        System.out.println("What is the result of the expression?");
        String[][] arr = new String[gamesCount][2];
        int i = 0;
        while (i < gamesCount) {
            String operation = getRandomOperator();
            int random1 = Utils.generateRandom(Constant.NUMBERMAX10);
            int random2 = Utils.generateRandom(Constant.NUMBERMAX10);
            arr[i][0] = "Question: " + random1 + " " + operation + " " + random2;
            arr[i][1] = getCorrectAnswer(random1, random2, operation);
            int flagToExit = Engine.gameLogic(arr[i]);
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
